package Weather;

public class App {
    public static void main(String[] args) {
        Weather weather = new Weather("GISMeteo");

        System.out.println(weather.getServiceName());
        System.out.println(weather.getTemperature("Kyiv"));

        weather.change("MeteoProg");

        System.out.println(weather.getServiceName());

        System.out.println(weather.getTemperature("Kyiv"));
    }
}
