package unit_testing_exam_10;

public class WeatherPredictor {
    private WeatherService weatherService = new WeatherService();


    public Integer predict(Integer degrees) {
        Integer result = weatherService.predict(degrees);
        return result;
    }


    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
