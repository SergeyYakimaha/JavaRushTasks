package Weather;

public class Weather {
    private WeatherService weatherService;

    private WeatherService createService(String serviceName) {
        switch (serviceName) {
            case ("GISMeteo"):
                return new GISMeteoFactory().createWeatherService();
            case ("MeteoProg"):
                return new MeteoProgFactory().createWeatherService();
            default:
                return null;
        }
    }

    Weather(String serviceName) {
        this.weatherService = createService(serviceName);
    }

    public void change(String serviceName) {
        this.weatherService = createService(serviceName);
    }

    public String getTemperature(String city) {
        return weatherService.getTemperature(city);
    }

    public String getServiceName() {
        return this.weatherService.getServiceName();
    }
}
