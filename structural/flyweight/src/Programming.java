public class Programming implements Job {

    private String language;
    private String certification;

    public Programming(){
        this.language = "Java";
    }

    @Override
    public void setCertification(String certification) {
        this.certification = certification;
    }

    @Override
    public String toString() {
        return "Programming{" +
                "language='" + language + '\'' +
                ", certification='" + certification + '\'' +
                '}';
    }
}
