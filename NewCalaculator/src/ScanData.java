import java.util.Scanner;

public class ScanData {

    private int mathOperationNumber;
    private int firstNumber;
    private int secondNumber;
    private Scanner scan;

    public ScanData() {
        scan = new Scanner(System.in);
    }

    public int getMathOperationNumber() {
        System.out.println("Please select number of operation:");
        mathOperationNumber = scan.nextInt();
        return mathOperationNumber;
    }

    public int getFirstNumber() {
        System.out.println("Please input first number:");
        firstNumber = scan.nextInt();
        return firstNumber;
    }

    public int getSecondNumber() {
        System.out.println("Please input second number:");
        secondNumber = scan.nextInt();
        return secondNumber;
    }


}
