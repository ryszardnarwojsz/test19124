public class Circle implements AreaPerimeterCalculation {

    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI *r;
    }
}
