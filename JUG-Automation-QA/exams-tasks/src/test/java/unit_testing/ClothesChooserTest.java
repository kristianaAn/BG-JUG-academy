package unit_testing;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import unit_testing_lectures.Clothes;
import unit_testing_lectures.ClothesChooser;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ClothesChooserTest {

    public ClothesChooser clothesChooser;

    @BeforeEach
    public void setUp() {
        clothesChooser = new ClothesChooser();
    }

    @ParameterizedTest
    @MethodSource("tempsAndClothesProvider")
    public void test_clothesChooser(int temp, Clothes cloth) {
        Clothes chosenCloth = clothesChooser.chooseCloth(temp);
        Assertions.assertEquals(cloth, chosenCloth);
    }

    static Stream<Arguments> tempsAndClothesProvider() {
        return Stream.of(
                arguments(5, Clothes.JACKET),
                arguments(10, Clothes.JACKET),
                arguments(15, Clothes.SHIRT),
                arguments(20, Clothes.T_SHIRT),
                arguments(23, Clothes.T_SHIRT)
        );
    }

    @Test
    public void test_clothesChooser_forLowTemp_returns() {
        Clothes chosenCloth = clothesChooser.chooseCloth(5);
        Assertions.assertEquals(Clothes.JACKET, chosenCloth);
    }

    @Test
    public void test_clothesChooser_forMidTemp_returns() {
        Clothes chosenCloth = clothesChooser.chooseCloth(15);
        Assertions.assertEquals(Clothes.SHIRT, chosenCloth);
    }

    @Test
    public void test_clothesChooser_forHighTemp_returns() {
        Clothes chosenCloth = clothesChooser.chooseCloth(23);
        Assertions.assertEquals(Clothes.T_SHIRT, chosenCloth);
    }
}
