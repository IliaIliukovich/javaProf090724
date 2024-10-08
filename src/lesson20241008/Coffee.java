package lesson20241008;

public enum Coffee {

    CAPPUCCINO("description 1", 80),
    LATTE("description 2", 100),
    AMERICANO("description 3", 70),
    ESPRESSO("description 4", 50),
    MACCHIATO("description 5", 100);

    private final int cost;

    private final String description;

    Coffee(String description, int cost) {
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Coffee{" + this.name() +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
