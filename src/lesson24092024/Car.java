package lesson24092024;

public class Car {

    public static int carCount;

    private String colour;

    {
        System.out.println("Non-static bloc init");
        colour = "Default colour";
    }

    static {
        System.out.println("Static bloc init");
        carCount = 0;
    }

    public Car(String colour) {
        System.out.println("Constructor at work");
        carCount++;
        this.colour = colour;
    }

    public static void displayCarCount() {
        System.out.println("Current car count: " + carCount);
    }

    public void displayCarInfo() {
        System.out.println("Current car colour: " + colour);
    }


}
