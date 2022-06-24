public class StatusDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public StatusDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {

        System.out.println(
                "Temperature=" + temperature + "C"+
                ", Humidity=" + humidity + "%" +
                ", Pressure=" + pressure + " Bar");
    }
}
