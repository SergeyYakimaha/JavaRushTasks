package Weather;

public class Weather {
    private WeatherService weatherService;

    private WeatherService createService(String serviceName) throws RuntimeException {

        WeatherService result = weatherService;

        if (weatherService == null || !weatherService.getServiceName().equals(serviceName)) {
            switch (serviceName) {
                case ("GISMeteo"):
                    result = new GISMeteoFactory().createWeatherService();
                    break;
                case ("MeteoProg"):
                    result = new MeteoProgFactory().createWeatherService();
                    break;
                default:
                    throw new RuntimeException("Я не могу создать " + serviceName);
            }
        }

        return result;
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
