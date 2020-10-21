package Weather;

public abstract class WeatherService {
    private String serviceName;

    public WeatherService(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    abstract String getTemperature(String city);
}
