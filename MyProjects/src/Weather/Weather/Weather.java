package Weather;

public class Weather {
    private WeatherService weatherService;

    private WeatherService createService(Services serviceName) throws RuntimeException {

        WeatherService result = this.weatherService;

        if (weatherService == null || this.weatherService.getServiceName() != serviceName) {
            switch (serviceName) {
                case GISMETEO:
                    result = new GISMeteoFactory().createWeatherService();
                    break;
                case METEOPROG:
                    result = new MeteoProgFactory().createWeatherService();
                    break;
                default:
                    throw new RuntimeException("Я не могу создать " + serviceName);
            }
        }

        return result;
    }

    Weather(Services serviceName) {
        this.weatherService = createService(serviceName);
    }

    public void change(Services serviceName) {
        this.weatherService = createService(serviceName);
    }

    public String getTemperature(String city) {
        return weatherService.getTemperature(city);
    }

    public Services getServiceName() {
        return this.weatherService.getServiceName();
    }
}
