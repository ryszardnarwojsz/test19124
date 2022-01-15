import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeCheckTest {

    @Test

    public void shouldPositiveVerifyAge1() {
        //given
        int a = Integer.MAX_VALUE;
        //when
        boolean age = AgeCheck.ageCheck(a);
        //then
        Assertions.assertTrue(age);
    }

    @Test

    public void shouldPositiveVerifyAge2() {
        //given
        int a = 18;
        //when
        boolean age = AgeCheck.ageCheck(a);
        //then
        Assertions.assertTrue(age);
    }

    @Test

    public void shouldNegativeVerifyAge1() {
        //given
        int a = Integer.MIN_VALUE;
        //when
        boolean age = AgeCheck.ageCheck(a);
        //then
        Assertions.assertFalse(age);
    }

    @Test

    public void shouldNegativeVerifyAge2() {
        //given
        int a = 17;
        //when
        boolean age = AgeCheck.ageCheck(a);
        //then
        Assertions.assertFalse(age);
    }


}