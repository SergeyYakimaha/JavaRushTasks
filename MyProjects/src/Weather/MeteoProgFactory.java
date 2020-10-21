package Weather;

public class MeteoProgFactory implements IServiceFactory {
    @Override
    public WeatherService createWeatherService() {
        return new MeteoProg();
    }
}
