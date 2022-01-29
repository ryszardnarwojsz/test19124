public class MathArray {

    MathOperations ArrayMathematics[] = new MathOperations[4];

    public void buildMathematicsArray() {

        ArrayMathematics[0] = new Addition();
        ArrayMathematics[1] = new Subtraction();
        ArrayMathematics[2] = new Multiplication();
        ArrayMathematics[3] = new Division();
    }

    public void arrayPrint() {

        System.out.println("# WELCOME TO CALCULATOR #");

        for (int i = 0; i < ArrayMathematics.length; i++) {
            System.out.println(i + " : " + ArrayMathematics[i]);
        }
    }

    public MathOperations getOperationObject(int i) {
        return ArrayMathematics[i];
    }

}
