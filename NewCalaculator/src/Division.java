public class Division implements MathOperations {

    @Override
     public double calculate (int a, int b) {
        return (double) a / (double) b;
    }

    @Override
    public String toString() {
        return "Division ";
    }


}

