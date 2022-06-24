public class Robot {

    private String head;
    private String body;
    private String hand;
    private String leg;

    public Robot(String head, String body, String hand, String leg) {
        this.head = head;
        this.body = body;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", hand='" + hand + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
