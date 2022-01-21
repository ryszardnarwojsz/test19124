import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea(){
            //given
            float a = 33;
            //when
            Square newSquare = new Square(a);
            double areaSquare = newSquare.getArea();
            //then
            Assertions.assertEquals(1089,areaSquare);
    }

    @Test
    void getPerimeter(){
        //given
        float a = 33;
        //when
        Square newSquare = new Square(a);
        double perimeterSquare = newSquare.getPerimeter();
        //then
        Assertions.assertEquals(132,perimeterSquare);
    }
}