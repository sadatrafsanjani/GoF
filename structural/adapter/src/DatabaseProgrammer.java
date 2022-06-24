public class DatabaseProgrammer implements Programmer {

    @Override
    public void program() {
        System.out.println("Programmer: SQL Programming...");
    }

    @Override
    public void documentation() {
        System.out.println("Programmer: Documentation...");
    }
}
