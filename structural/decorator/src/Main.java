public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost() + "\n");

        Beverage beverage2 = new Decaf();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
