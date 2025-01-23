package lesson20250123.solid;

public class BMWService implements CarService{
    @Override
    public void service() {
        System.out.println("Special service for BMW");
    }
}
