package Weather;

public class MeteoProg extends WeatherService {
    MeteoProg() {
        super("MeteoProg");
    }

    @Override
    String getTemperature(String city) {
        return city + "22";
    }
}
