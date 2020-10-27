package Weather;

public class GISMeteo extends WeatherService {
    GISMeteo() {
        super(Services.GISMETEO);
    }

    @Override
    String getTemperature(String city) {
        return city + " - 11 t";
    }
}
