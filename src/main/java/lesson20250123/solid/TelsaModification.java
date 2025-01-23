package lesson20250123.solid;

public class TelsaModification extends Tesla {

    @Override
    public CarService getCarService() {
        throw new RuntimeException("No service available");
    }


}
