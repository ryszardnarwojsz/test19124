public class Subtraction extends MathOperations {

    @Override
    public double calculateParameters(int a, int b) {
        return Math.subtractExact(a,b);
    }

    @Override
    public String toString() {
        return "Subtraction ";
    }
}

