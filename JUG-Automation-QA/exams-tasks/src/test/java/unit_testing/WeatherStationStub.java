package unit_testing;

import lombok.Getter;
import lombok.Setter;
import unit_testing_lectures.WeatherStation;

@Getter
@Setter
public class WeatherStationStub extends WeatherStation {
    public int temperature;

    public WeatherStationStub(int temperature) {
        this.temperature = temperature;
    }

    public int getWeatherTemp() {
        //http call to weather forecaster
        return temperature;
    }

}
