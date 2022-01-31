public class MathArray {

    MathOperations[] arrayMathematics = new MathOperations[4];

    public void buildMathematicsArray() {

        arrayMathematics[0] = new Addition();
        arrayMathematics[1] = new Subtraction();
        arrayMathematics[2] = new Multiplication();
        arrayMathematics[3] = new Division();
    }

    public void arrayPrint() {

        System.out.println("# WELCOME TO CALCULATOR #");

        for (int i = 0; i < arrayMathematics.length; i++) {
            System.out.println(i + " : " + arrayMathematics[i]);
        }
    }

    public MathOperations getOperationObject(int i) {
        return arrayMathematics[i];
    }

}
