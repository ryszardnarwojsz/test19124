import java.util.concurrent.Callable;

public class GeometricFigures {

    public static void main(String[] args) {

        Rectangle newRectangle = new Rectangle(2,4);
        System.out.println(newRectangle.getArea());
        System.out.println(newRectangle.getPerimeter());

        Circle newCircle = new Circle(4);
        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getPerimeter());

        Triangle newTriangle = new Triangle(4,3,6,5);
        System.out.println(newTriangle.getArea());
        System.out.println(newTriangle.getPerimeter());

        Square newSquare = new Square(2.3F);
        System.out.println(newSquare.getArea());
        System.out.println(newSquare.getPerimeter());

    }


}

