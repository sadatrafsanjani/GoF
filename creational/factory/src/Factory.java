import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<String, Aircraft> aircraftMap = new HashMap<>();

    public Factory(){
        aircraftMap.put("FIGHTER", new Fighter());
        aircraftMap.put("HELICOPTER", new Helicopter());
    }

    public Aircraft manufactureAircraft(String type) {

        if(aircraftMap.containsKey(type)){
            return aircraftMap.get(type);
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
