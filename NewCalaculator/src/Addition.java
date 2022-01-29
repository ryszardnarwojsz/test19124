public class Addition extends MathOperations {

    @Override
    public double calculateParameters(int a, int b) {
        return Math.addExact(a, b);
    }

    @Override
    public String toString() {
        return "Addition ";
    }
}

