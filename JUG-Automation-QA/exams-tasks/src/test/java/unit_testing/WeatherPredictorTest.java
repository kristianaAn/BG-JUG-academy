package unit_testing;

import unit_testing_exam_10.WeatherPredictor;
import unit_testing_exam_10.WeatherService;

@org.junit.jupiter.api.extension.ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class WeatherPredictorTest {

    @org.mockito.Mock
    public WeatherService weatherService;
    public WeatherPredictor weatherPredictor;

    @org.junit.jupiter.api.Test
    public void testWeatherServiceNotThrows() {
        int degrees = 15;

        weatherPredictor = new WeatherPredictor();
        weatherPredictor.setWeatherService(weatherService);

        org.mockito.Mockito.when(weatherService.predict(degrees)).thenReturn(degrees);

        Integer actual = weatherPredictor.predict(degrees);

        org.junit.jupiter.api.Assertions.assertEquals(degrees, actual);
    }

}
