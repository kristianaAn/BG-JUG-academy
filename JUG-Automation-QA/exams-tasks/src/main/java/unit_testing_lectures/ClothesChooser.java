package unit_testing_lectures;

public class ClothesChooser {
    private WeatherStation weatherStation;

    public ClothesChooser(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public Clothes chooseCloth() {
        int temp = weatherStation.getWeatherTemp();

        if (temp <= 10) {
            return Clothes.JACKET;
        } else if (temp < 20) {
            return Clothes.SHIRT;
        } else {
            return Clothes.T_SHIRT;
        }

    }

}
