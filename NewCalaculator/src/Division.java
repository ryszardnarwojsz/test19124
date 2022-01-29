public class Division extends MathOperations {

    @Override
    protected double calculateParameters(int a, int b) {
        return (double) a / (double) b;
    }

    @Override
    public String toString() {
        return "Division ";
    }
}

