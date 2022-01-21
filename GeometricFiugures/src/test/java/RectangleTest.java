import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        //given
        float a = 34.5F;
        float b = 22.1F;
        //when
        Rectangle newRectangle = new Rectangle(a,b);
        double areaRectangle = newRectangle.getArea();
        //then
        Assertions.assertEquals(762.4500122070312D,areaRectangle);
    }

    @Test
    void getPerimeter() {
        ///given
        float a = 4.5F;
        float b = 2.1F;
        //when
        Rectangle newRectangle = new Rectangle(a,b);
        double perimeterRectangle = newRectangle.getPerimeter();
        //then
        Assertions.assertEquals(13.2F,perimeterRectangle);

    }
}