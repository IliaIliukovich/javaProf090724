package lesson20250123.solid;

public class Tesla extends Car{
    @Override
    public void move() {
        // logic to move
    }

    @Override
    public CarService getCarService() {
        return new TeslaService();
    }
}
