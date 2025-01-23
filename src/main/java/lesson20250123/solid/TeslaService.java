package lesson20250123.solid;

public class TeslaService implements CarService{
    @Override
    public void service() {
        System.out.println("Special service for Tesla");
    }
}
