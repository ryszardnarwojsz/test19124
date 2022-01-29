public class NewCalculator {

    public static void main(String[] args) {

        MathArray MathematicsArray = new MathArray();
        MathematicsArray.buildMathematicsArray();
        MathematicsArray.arrayPrint();

        ScanData NewScan = new ScanData();
        int numberOfmathOperation = NewScan.getMathOperationNumber();
        int firstNumber = NewScan.getFirstNumber();
        int secondNumber = NewScan.getSecondNumber();

        MathOperations chosenOperation = MathematicsArray.getOperationObject(numberOfmathOperation);
        MathOperations newMathematicsOperation = new MathOperations(firstNumber,secondNumber);

        System.out.println("Result of " + chosenOperation.toString() + " = " + newMathematicsOperation.calculate(chosenOperation));


    }



}
