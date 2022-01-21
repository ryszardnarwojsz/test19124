import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {


    @Test
    void getArea() {
        //given
        float r = 24.564F;
        //when
        Circle newCircle = new Circle(r);
        double circleArea = newCircle.getArea();
        //then
        Assertions.assertEquals(1895.605765670066D,circleArea);
    }

    @Test
    void getPerimeter() {
        //given
        float r = 2F;
        //when
        Circle newCircle = new Circle(r);
        double circlePerimeter = newCircle.getPerimeter();
        //then
        Assertions.assertEquals(12.566370614359172D,circlePerimeter);
    }
}