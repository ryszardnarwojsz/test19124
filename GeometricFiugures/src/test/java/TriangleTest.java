import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        //given
        float a = 45;
        float b = 66;
        float c =100;
        float h =47;
        //when
       Triangle newTriangle = new Triangle(a,b,c,h);
       double areaTriangle = newTriangle.getArea();
        //then
        Assertions.assertEquals(1057.5,areaTriangle);
    }

    @Test
    void getAreaWrong() {
        //given
        float a = 45;
        float b = 3;
        float c =100;
        float h =47;
        //when
        Triangle newTriangle = new Triangle(a,b,c,h);
        double areaTriangle = newTriangle.getArea();
        //then
        Assertions.assertEquals(0,areaTriangle);
    }

    @Test
    void getPerimeter() {
        //given
        float a = 40;
        float b = 60;
        float c =90;
        float h =55;
        //when
        Triangle newTriangle = new Triangle(a,b,c,h);
        double perimeterTriangle = newTriangle.getPerimeter();
        //then
        Assertions.assertEquals(190,perimeterTriangle);
    }
}