import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTriangleTest {

    @Test
    void ifRectangularTriangle1() {
        //given
        float a = (float) 4.1;
        float b = (float) 2.3;
        float c = (float) 4.701063709417263;
        //when
        boolean isTriangle = RectangularTriangle.ifRectangularTriangle(a,b,c);
        //then
        Assertions.assertTrue(isTriangle);
    }

    @Test
    void ifRectangularTriangle2() {
        //given
        float a = (float) 4.1;
        float b = (float) 2.3;
        float c = (float) 4.7010;
        //when
        boolean isTriangle = RectangularTriangle.ifRectangularTriangle(a,b,c);
        //then
        Assertions.assertFalse(isTriangle);
    }

}