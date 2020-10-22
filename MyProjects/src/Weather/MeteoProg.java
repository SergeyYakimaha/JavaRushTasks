package Weather;

public class MeteoProg extends WeatherService {
    MeteoProg() {
        super(Services.METEOPROG);
    }

    @Override
    String getTemperature(String city) {
        return city + " - 22 t";
    }
}
