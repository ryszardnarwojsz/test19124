public class Triangle {

    private float width;
    private float height;


    public Triangle(float width, float height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
