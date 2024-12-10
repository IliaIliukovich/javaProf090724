package summary20241004.inversionofcontrol;

public class Lamp implements Switchable {

    private boolean isOn;

    public void on(boolean on) {
        isOn = on;
    }

    public void checkState() {
        System.out.println("Currently lamp is: " + ((isOn) ? "on" : "off"));
    }

}
