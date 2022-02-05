import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @ParameterizedTest
    @MethodSource("provideSampleText")
    void textLenghtCheck(String input,int expected) {
        Assertions.assertEquals(expected, Text.textLenghtCheck(input));
    }

    private static Stream<Arguments> provideSampleText(){

        return Stream.of(
                Arguments.of("Hello",5),
                Arguments.of("Hi",2),
                Arguments.of("My name is Rysiek",17),
                Arguments.of("",0),
                Arguments.of(" ",1)
        );
    }
}