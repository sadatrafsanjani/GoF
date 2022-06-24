public class Main {

    public static void main(String[] args) {

        Weather weather = new Weather();
        StatusDisplay status = new StatusDisplay(weather);

        weather.setData(80, 65, 30.4f);
        status.display();
        weather.setData(82, 70, 29.2f);
        status.display();
        weather.setData(78, 90, 29.2f);
        status.display();

    }
}
