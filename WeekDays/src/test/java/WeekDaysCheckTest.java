import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDaysCheckTest {

    @Test
    void weekDaysVerification1() {
        //given
        int day = 2;
        //when
        String dayName = WeekDaysCheck.weekDaysVerification(day);
        //then
        Assertions.assertEquals("Tuesday", dayName);
    }

    @Test
    void weekDaysVerification2() {
        //given
        int day = Integer.MAX_VALUE;
        //when
        String dayName = WeekDaysCheck.weekDaysVerification(day);
        //then
        Assertions.assertEquals("There is no such day", dayName);
    }
}