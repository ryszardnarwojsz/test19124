public class Square implements AreaPerimeterCalculation{

    private float a;

    public Square(float a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
