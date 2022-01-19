import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTriangleTest {

    @Test
    void isRectangularTriangle1() {
        //given
        float a = 4.1F;
        float b = 2.3F;
        float c = 4.701063709417263F;
        //when
        boolean isTriangle = RectangularTriangle.isRectangularTriangle(a,b,c);
        //then
        assertTrue(isTriangle);
    }

    @Test
    void isRectangularTriangle2() {
        //given
        float a = 4.701063709417263F;
        float b = 2.3F;
        float c = 4.1F;
        //when
        boolean isTriangle = RectangularTriangle.isRectangularTriangle(a,b,c);
        //then
        Assertions.assertTrue(isTriangle);
    }

    @Test
    void isRectangularTriangle3() {
        //given
        float a = 4.1F;
        float b = 2.3F;
        float c = 4.7010F;
        //when
        boolean isTriangle = RectangularTriangle.isRectangularTriangle(a,b,c);
        //then
        Assertions.assertFalse(isTriangle);
    }

}