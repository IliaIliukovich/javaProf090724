package summary20241004.inversionofcontrol;

public class TableLight implements Switchable {
    private boolean isOn;

    public void on(boolean on) {
        isOn = on;
    }

    public void checkState() {
        System.out.println("Currently Table Light is: " + ((isOn) ? "on" : "off"));
    }
}
