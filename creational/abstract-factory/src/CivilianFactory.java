public class CivilianFactory implements AbstractFactory {

    @Override
    public Aircraft getAircraftType(String type) {

        if(type == null){
            throw new IllegalArgumentException();
        }

        if(type.equals("COPTER")){
            return new Helicopter("Civilian");
        }

        if(type.equals("CARGO")){
            return new Cargo("Civilian");
        }

        return null;
    }
}
