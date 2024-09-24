package lesson24092024;

public class Car {

    public static int carCount = 0;

    private String colour;

    {
        System.out.println("Non-static bloc init");
        colour = "Default colour";
    }

    public Car(String colour) {
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
