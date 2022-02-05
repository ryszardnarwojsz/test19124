import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


class LettersFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"RYSIEK", "KRZYSIEK", "OLA", " "})
    void changeToUpperCase(String input) {
        Assertions.assertSame(LettersFormatter.changeToUpperCase(input), input);
    }

    @ParameterizedTest
    @NullSource
    void changeToUpperCaseForNull(String input) {
        Assertions.assertSame("", LettersFormatter.changeToUpperCase(input));
    }

}