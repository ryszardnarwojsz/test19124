import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {300000, 22, -18, 66, 100})
    void isModuloTwo(int input) {
        Assertions.assertTrue(NumberChecker.isModuloTwo(input));
    }


    @ParameterizedTest
    @CsvSource(value = {"12:3", " 123:6", " 234:9"}, delimiter = ':')
    void SumOfDigits(int input, int expected) {
        Assertions.assertEquals(expected,NumberChecker.sumOfDigits(input));
    }

}