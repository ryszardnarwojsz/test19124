public class Multiplication extends MathOperations {

    @Override
    protected double calculateParameters(int a, int b) {
    return a * b;
}

    @Override
    public String toString() {
        return "Multiplication ";
    }

}
