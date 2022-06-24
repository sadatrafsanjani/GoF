public class MilitaryFactory implements AbstractFactory {

    @Override
    public Aircraft getAircraftType(String type) {

        if(type == null){
            throw new IllegalArgumentException();
        }

        if(type.equals("COPTER")){
            return new Helicopter("Military");
        }

        if(type.equals("CARGO")){
            return new Cargo("Military");
        }

        return null;
    }
}
