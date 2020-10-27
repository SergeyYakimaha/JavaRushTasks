package Weather;

public class App {
    public static void main(String[] args) {
        try {
            Weather weather = new Weather(Services.GISMETEO);

            System.out.println(weather.getServiceName());
            System.out.println(weather.getTemperature("Kyiv"));

            weather.change(Services.METEOPROG);

            System.out.println(weather.getServiceName());

            System.out.println(weather.getTemperature("Kyiv"));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
