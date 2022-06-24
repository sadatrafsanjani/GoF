public class Main {

    public static void main(String[] args) {

        Robot robot = new Builder()
                .body("Body")
                .head("Head")
                .hand("Hand")
                .leg("Leg")
                .build();

        System.out.println(robot);

        robot = new Builder()
                .body("Carbon")
                .head("Metal")
                .hand("Mesh")
                .leg("Steel")
                .build();

        System.out.println(robot);
    }
}
