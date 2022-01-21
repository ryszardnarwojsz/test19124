public class Rectangle extends Shape {

    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(float a) {
        this.a = a;
        this.b = a;
    }

    @Override
    protected double getArea() {
        return a * b;
    }

    @Override
    protected double getPerimeter(){
        return 2 * a + 2 * b;
    }
}
