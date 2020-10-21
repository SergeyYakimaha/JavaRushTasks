package Weather;

public class GISMeteo extends WeatherService {
    GISMeteo() {
        super("GISMeteo");
    }

    @Override
    String getTemperature(String city) {
        return city + "11";
    }
}
