package Weather;

public abstract class WeatherService {
    private Services serviceName;

    public WeatherService(Services serviceName) {
        this.serviceName = serviceName;
    }

    public Services getServiceName() {
        return serviceName;
    }

    public void setServiceName(Services serviceName) {
        this.serviceName = serviceName;
    }

    abstract String getTemperature(String city);
}
