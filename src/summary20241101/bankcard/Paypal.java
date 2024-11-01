package summary20241101.bankcard;

public class Paypal extends Card {

    private int payPalId;

    private String name;

    private String surname;

    private String secretCode;

    @Override
    public int getIt() {
        return payPalId;
    }

    public Paypal(int payPalId, String name, String surname, String secretCode) {
        this.payPalId = payPalId;
        this.name = name;
        this.surname = surname;
        this.secretCode = secretCode;
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "payPalId=" + payPalId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }
}
