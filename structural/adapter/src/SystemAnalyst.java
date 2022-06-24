public class SystemAnalyst implements Analyst {

    @Override
    public void analysis() {
        System.out.println("Analyst: System Analysis...");
    }

    @Override
    public void documentation() {
        System.out.println("Analyst: Office Document Maintenance...");
    }
}
