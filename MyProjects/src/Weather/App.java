package Weather;

public class App {
    public static void main(String[] args) {
        try {
            Weather weather = new Weather("GISMeteo");

            System.out.println(weather.getServiceName());
            System.out.println(weather.getTemperature("Kyiv"));

            weather.change("GISMeteo2");

            System.out.println(weather.getServiceName());

            System.out.println(weather.getTemperature("Kyiv"));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
