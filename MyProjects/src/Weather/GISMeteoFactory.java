package Weather;

public class GISMeteoFactory implements IServiceFactory {
    @Override
    public WeatherService createWeatherService() {
        return new GISMeteo();
    }
}
