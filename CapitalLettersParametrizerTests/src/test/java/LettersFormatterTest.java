import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


class LettersFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"RYSIEK", "KRZySIEK", "OLA", " ","jadzia",})
    void changeToUpperCase(String input) {
        Assertions.assertEquals(LettersFormatter.changeToUpperCase(input), input.toUpperCase());
    }

    @ParameterizedTest
    @NullSource
    void changeToUpperCaseForNull(String input) {
        Assertions.assertEquals("", LettersFormatter.changeToUpperCase(input));
    }

}