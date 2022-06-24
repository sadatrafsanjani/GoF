public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        AbstractFactory militaryFactory = factory.createFactory("MILITARY");
        AbstractFactory civilianFactory = factory.createFactory("CIVILIAN");

        Aircraft militaryCargo = militaryFactory.getAircraftType("CARGO");
        militaryCargo.manufacture();

        Aircraft militaryCopter = militaryFactory.getAircraftType("COPTER");
        militaryCopter.manufacture();

        Aircraft civilianCargo = civilianFactory.getAircraftType("CARGO");
        civilianCargo.manufacture();

        Aircraft civilianCopter = civilianFactory.getAircraftType("COPTER");
        civilianCopter.manufacture();
    }
}
