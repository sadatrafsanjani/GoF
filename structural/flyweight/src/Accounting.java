public class Accounting implements Job {

    private String skill;
    private String certification;

    public Accounting(){
        this.skill = "Book Keeping";
    }

    @Override
    public void setCertification(String certification) {
        this.certification = certification;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "skill='" + skill + '\'' +
                ", certification='" + certification + '\'' +
                '}';
    }
}
