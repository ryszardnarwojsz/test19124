import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test

    public void shouldAddTwoValues(){

        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        //when

        long sum = Calculator.sum(a, b);

        //then
        Assertions.assertEquals(4294967294L,(long) sum);
    }

    @Test

    public void shouldSubtractTwoValues(){

        //given
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;

        //when

        long subtraction = Calculator.subtraction(a,b);

        //then
        Assertions.assertEquals(-4294967295L,subtraction);

    }

    @Test

    public void shouldMultiplyTwoValues(){

        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        //when

        long multiplication = Calculator.multiplication(a,b);

        //then
        Assertions.assertEquals(4611686014132420609L,multiplication);
    }

    @Test

    public void shouldDivideTwoValues(){

        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        //when

        double division = Calculator.division(a,b);

        //then

        Assertions.assertEquals(-0.9999999995343387,division);
    }


}