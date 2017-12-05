public final class WeatherProvider {
    private final WeatherProvider weatherProvider;
    private String weather[] = {"SUN", "RAIN", "FOG", "SNOW"};

    public  WeatherProvider getWeatherProvider() {
        return weatherProvider;
    }

    private WeatherProvider() {
        this.weatherProvider = new WeatherProvider();
    }

    public String getCurrentWeather(Coordinates coordinates) {
        return weather[0];
    }

}

//singleton
