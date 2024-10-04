package summary20241004.inversionofcontrol;

public class Switcher {

    private Switchable switchable;

    public Switcher(Switchable switchable) {
        this.switchable = switchable;
    }

    public void switchOn() {
        switchable.on(true);
    }

    public void switchOff() {
        switchable.on(false);
    }

    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Switcher switcher = new Switcher(lamp);

        switcher.switchOn();
        lamp.checkState();

        switcher.switchOff();
        lamp.checkState();

        Lamp lamp2 = new Lamp();
        switcher.setSwitchable(lamp2);

        TableLight light = new TableLight();
        switcher.setSwitchable(light);

        switcher.switchOn();
        light.checkState();
    }

    public void setSwitchable(Switchable switchable) {
        this.switchable = switchable;
    }
}
