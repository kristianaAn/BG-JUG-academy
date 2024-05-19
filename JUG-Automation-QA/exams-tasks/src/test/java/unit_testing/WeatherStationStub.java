package unit_testing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import unit_testing_lectures.WeatherStation;

public class WeatherStationStub extends WeatherStation {
    public int temperature;

    public WeatherStationStub(int temperature) {
        this.temperature = temperature;
    }

    public int getWeatherTemp() {
        //http call to weather forecaster
        return temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
