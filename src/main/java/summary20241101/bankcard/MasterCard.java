package summary20241101.bankcard;

public class MasterCard extends Card {

    private int masterCardId;

    public MasterCard(int masterCardId) {
        this.masterCardId = masterCardId;
    }

    @Override
    public int getId() {
        return masterCardId;
    }

    public int getMasterCardId() {
        return masterCardId;
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "masterCardId=" + masterCardId +
                '}';
    }
}
