public class Helicopter implements Aircraft {

    private String type;

    public Helicopter(String type) {
        this.type = type;
    }

    @Override
    public void manufacture() {
        System.out.println(type + " Helicopter");
    }
}
