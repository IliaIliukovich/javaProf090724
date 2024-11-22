package summary20241101.bankcard;

public abstract class Card implements Comparable<Card> {

    public abstract int getId();

    @Override
    public int compareTo(Card another) {
        return Integer.compare(this.getId(), another.getId());
    }


}
