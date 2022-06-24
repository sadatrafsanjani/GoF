public class Factory {

    public AbstractFactory createFactory(String factory){

        AbstractFactory abstractFactory;

        switch(factory){

            case "MILITARY":
                abstractFactory = new MilitaryFactory();
                break;

            case "CIVILIAN":
                abstractFactory = new CivilianFactory();
                break;

            default:
                abstractFactory = null;
        }

        return abstractFactory;
    }
}
