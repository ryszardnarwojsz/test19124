public class MathOperations {

    protected int a;
    protected int b;
    protected String operationName;

    public MathOperations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MathOperations() {}

    public double calculate(MathOperations newMathematicsOperation) {
        return newMathematicsOperation.calculateParameters(a, b);
    }

    protected double calculateParameters(int a, int b) {
        return 0;
    }

}




