public class Main {

    public static void main(String[] args) {

        NotificationFacade facade = new NotificationFacade();

        facade.sendEmail();
        facade.sendSMS();
    }
}
