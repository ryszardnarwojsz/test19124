import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesSecondsConversionTest {

    @Test
    void conversionMinutesIntoSeconds() {
        //given
        int minutes = Integer.MAX_VALUE;
        //when
        double seconds = MinutesSecondsConversion.conversionMinutesIntoSeconds(minutes);
        //then
        Assertions.assertEquals(128849018820D, seconds);
    }
}