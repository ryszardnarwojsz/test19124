import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        //given
        float a = 22.4F;
        //when
        Square newSquare = new Square(a);
        double areaSquare = newSquare.getArea();
        //then
        Assertions.assertEquals(501.7599829101564D,areaSquare);
    }

    @Test
    void getPerimeter() {
        //given
        float a = 3;
        //when
        Square newSquare = new Square(a);
        double perimeterSquare = newSquare.getPerimeter();
        //then
        Assertions.assertEquals(12,perimeterSquare);
    }
}