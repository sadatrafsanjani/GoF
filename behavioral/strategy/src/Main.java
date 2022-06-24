
public class Main {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.fly();
        mallard.swim();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
        rubberDuck.swim();

        Duck tealDuck = new TealDuck();
        tealDuck.setFlyBehavior(new FlyNoWay());
        tealDuck.setQuackBehavior(new Mute());
        tealDuck.display();
        tealDuck.quack();
        tealDuck.fly();
        tealDuck.swim();

    }
}
