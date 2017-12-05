public class WeatherProvider {

    private static WeatherProvider weatherProvider;
    private WeatherProvider() {}

    public static WeatherProvider getProvider() {
        if (weatherProvider == null)
            weatherProvider = new WeatherProvider();
        return weatherProvider;
    }

    private String weather[] = {"SUN", "RAIN", "FOG", "SNOW"};

    public String getCurrentWeather(Coordinates coordinates) {
        return weather[0];
    }

}

//singleton
