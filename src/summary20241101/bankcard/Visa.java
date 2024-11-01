package summary20241101.bankcard;

public class Visa extends Card {
    private int visaId;

    public Visa(int visaId) {
        this.visaId = visaId;
    }

    @Override
    public int getIt() {
        return visaId;
    }

    public int getVisaId() {
        return visaId;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "visaId=" + visaId +
                '}';
    }
}
