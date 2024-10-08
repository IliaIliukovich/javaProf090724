package lesson20241008;

public class CoffeeMachine {

    private int currentAmount;

// Кофемашина:
// 1. Создать перечисление Coffee с разными вариантами кофе
// - Cappuccino
// - Latte
// - Americano
// - Espresso
// - Macchiato
// У каждого сорта кофе есть цена и описание.
// 2. В классе CoffeeMachine реализовать метод displayInfo(Coffee coffee), который выводил бы информацию о выбранном кофе.
// 3. Реализовать метод makeCoffee(Coffee coffee, int money), который проверял бы, достаточно ли средств,
// готовил бы кофе и выдавал сдачу. Если выбрано капучино, автомат сообщает, что данного вида кофе нет.

    // ctrl-a выделить все
    // ctrl-c копировать
    // ctrl-v вставить
    // ctrl-x вырезать
    // ctrl-z отменить предыдущее действие

    // ctrl-d дублировать строку
    // ctrl-y удалить строку
    // alt-shift + стрелка вверх / вниз  -- перенос строки
    // shift-enter -- переход на новую строку

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.makeCoffee(Coffee.LATTE, 70);
        machine.makeCoffee(Coffee.LATTE, 50);
        int moneyBack = machine.getMoneyBack();

        CoffeeMachine machine2 = new CoffeeMachine();
        machine2.makeCoffee(Coffee.AMERICANO, 70);
    }

    public void makeCoffee(Coffee coffee, int money) {
        currentAmount += money;
        if (coffee == Coffee.CAPPUCCINO) {
            System.out.println("Sorry, no Cappuccino in coffee machine");
        } else {
            if (currentAmount >= coffee.getCost()) {
                System.out.println("Please, take " + coffee.name());
                currentAmount -= coffee.getCost();
            } else {
                System.out.println("Not enough money for " + coffee);
            }
        }
    }

    public int getMoneyBack() {
        int money = currentAmount;
        currentAmount = 0;
        System.out.println("Please, take you money back: " + money + " cents");
        return money;

    }



}
