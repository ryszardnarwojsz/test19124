import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenNumberCheckTest {

    @Test
    void isEven() {
        //given
        int a = Integer.MAX_VALUE;
        //when
        boolean isEvenNumber = EvenNumberCheck.isEven(a);
        //then
        Assertions.assertFalse(isEvenNumber);
    }

    @Test
    void isOdd() {
        //given
        int a = Integer.MAX_VALUE;
        //when
        boolean isOddNumber = EvenNumberCheck.isOdd(a);
        //then
        Assertions.assertTrue(isOddNumber);
    }
}