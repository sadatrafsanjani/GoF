public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        Aircraft fighter = factory.manufactureAircraft("FIGHTER");
        Aircraft helicopter = factory.manufactureAircraft("HELICOPTER");

        fighter.manufacture();
        helicopter.manufacture();
    }
}
