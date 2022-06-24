public class Main {

    public static void main(String[] args) {

        Job programming = new Factory().getJob("Programming");
        Job accounting = new Factory().getJob("Accounting");

        programming.setCertification("OCA");
        accounting.setCertification("CPA");

        System.out.println(programming);
        System.out.println(accounting);
    }
}
