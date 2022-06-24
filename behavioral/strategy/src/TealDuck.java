public class TealDuck extends Duck {

    public TealDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("Teal");
    }
}
