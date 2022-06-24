public abstract class Beverage {

    void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void sweet(){
    }
}
