public class Addition implements MathOperations {

    @Override
    public String toString() {
        return "Addition ";
    }

    @Override
    public double calculate(int a, int b) {
        return a + b;
    }
}

