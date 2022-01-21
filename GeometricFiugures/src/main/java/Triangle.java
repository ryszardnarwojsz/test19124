import java.util.Arrays;

public class Triangle extends Shape{

    private float a;
    private float b;
    private float c;
    private float h;


    public Triangle(float a, float b, float c, float h) {

        float[] arrayTriangle= new float[3];
        arrayTriangle[0]=a;
        arrayTriangle[1]=b;
        arrayTriangle[2]=c;
        Arrays.sort(arrayTriangle);

        if (arrayTriangle[0] + arrayTriangle[1]  < arrayTriangle[2] || h > arrayTriangle[2]) {
            System.out.println("Not possible to build triangle");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

    }


    @Override
    protected double getArea() {
        return 0.5 * a * h ;
    }

    @Override
    protected double getPerimeter() {
        return a + b + c;
    }
}
