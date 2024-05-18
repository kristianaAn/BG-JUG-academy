package unit_testing_lectures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClothesChooser {
    private int temp;

    public Clothes chooseCloth(int temp) {
        if (temp <= 10) {
            return Clothes.JACKET;
        } else if (temp < 20) {
            return Clothes.SHIRT;
        } else {
            return Clothes.T_SHIRT;
        }

    }

}
