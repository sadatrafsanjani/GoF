public class Cargo implements Aircraft {

    private String type;

    public Cargo(String type) {
        this.type = type;
    }

    @Override
    public void manufacture() {
        System.out.println(type + " Cargo");
    }
}
