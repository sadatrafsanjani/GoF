public class NotificationFacade {

    private EmailNotification emailNotification;
    private SMSNotification smsNotification;

    public NotificationFacade() {

        emailNotification = new EmailNotification();
        smsNotification = new SMSNotification();
    }

    public void sendEmail(){
        this.emailNotification.sendNotification();
    }

    public void sendSMS(){
        this.smsNotification.sendNotification();
    }
}
