public class Builder {

    private String head;
    private String body;
    private String hand;
    private String leg;

    public Builder head(String head) {
        this.head = head;
        return this;
    }

    public Builder body(String body) {
        this.body = body;
        return this;
    }

    public Builder hand(String hand) {
        this.hand = hand;
        return this;
    }

    public Builder leg(String leg) {
        this.leg = leg;
        return this;
    }

    public Robot build() {

        return new Robot(head, body, hand, leg);
    }
}
