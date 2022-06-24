public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    @Override
    void display() {
        System.out.println("Rubber");
    }
}
