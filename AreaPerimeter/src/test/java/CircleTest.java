import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        //given
        float r = 12;
        //when
        Circle newCircle = new Circle(r);
        double areaCircle = newCircle.getArea();
        //then
        Assertions.assertEquals(452.3893421169302D,areaCircle);
    }

    @Test
    void getPerimeter() {
        //given
        float r = 10;
        //when
        Circle newCircle = new Circle(r);
        double perimeterCircle = newCircle.getPerimeter();
        //then
        Assertions.assertEquals(62.83185307179586D,perimeterCircle);
    }
}