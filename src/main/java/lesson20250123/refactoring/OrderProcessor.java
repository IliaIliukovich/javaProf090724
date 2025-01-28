package lesson20250123.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderProcessor {
    private List<Order> orders = new ArrayList<>();

    public void processOrder(String customerId, List<String> itemIds, String shippingMethod) {
        Customer customer = getCustomerById(customerId);
        if (customer == null) {
            logMessage("Customer not found");
            return;
        }

        List<Item> items = getItemsInCart(itemIds);
        if (items.isEmpty()) {
            logMessage("No valid items found for order");
            return;
        }

        double totalPrice = calculateTotalPrice(items);

        if (!isValidShippingMethod(shippingMethod)) {
            logMessage("Invalid shipping method");
            return;
        }
        double shippingCost = getShippingCost(shippingMethod);

        Order order = createOrder(customer, items, totalPrice, shippingCost);
        orders.add(order);
        logMessage("Order processed: " + order.getId());
    }

    private static Order createOrder(Customer customer, List<Item> items, double totalPrice, double shippingCost) {
        Order order = new Order();
        order.setCustomer(customer);
        order.setItems(items);
        order.setTotalAmount(totalPrice);
        order.setShippingCost(shippingCost);
        order.setOrderStatus("Processing");
        return order;
    }

    private boolean isValidShippingMethod(String shippingMethod) {
        return Arrays.stream(ShippingMethod.values()).anyMatch(m -> m.name.equals(shippingMethod));
    }

    private static Double getShippingCost(String shippingMethod) {
        return Arrays.stream(ShippingMethod.values()).filter(m -> m.name.equals(shippingMethod)).findAny().get().price;
    }

    private static double calculateTotalPrice(List<Item> items) {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    private List<Item> getItemsInCart(List<String> itemIds) {
        return itemIds.stream().map(id -> {
            Item item = getItemById(id);
            if (item != null) {
                return item;
            } else {
                logMessage("Item not found: " + id);
                return null;
            }
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    public void cancelOrder(long orderId) {
        Optional<Order> optional = getOrder(orderId);
        if (optional.isPresent()) {
            Order order = optional.get();
            orders.remove(order);
            logMessage("Order canceled: " + order.getId());
        } else {
            logMessage("Order not found: " + orderId);
        }
    }

    private Optional<Order> getOrder(long orderId) {
        return orders.stream().filter(order -> order.getId() == orderId).findAny();
    }

    public void printOrderDetails(long orderId) {
        Optional<Order> optional = getOrder(orderId);
        if (optional.isPresent()) {
            Order foundOrder = optional.get();
            logMessage("Order Details: ");
            logMessage("Customer: " + foundOrder.getCustomer().getName());
            logMessage("Items: ");
            for (Item item : foundOrder.getItems()) {
                logMessage(" - " + item.getName() + ": $" + item.getPrice());
            }
            logMessage("Total Amount: $" + foundOrder.getTotalAmount());
            logMessage("Shipping Cost: $" + foundOrder.getShippingCost());
            logMessage("Status: " + foundOrder.getOrderStatus());
        } else {
            logMessage("Order not found: " + orderId);
        }
    }

    private Customer getCustomerById(String customerId) {
        // Simulated method to get customer by ID
        return new Customer(customerId, "Customer Name");
    }

    private Item getItemById(String itemId) {
        // Simulated method to get item by ID
        return new Item(itemId, "Item Name", Math.random() * 100);
    }

    private static void logMessage(String message) {
        System.out.println(message);
    }
}
