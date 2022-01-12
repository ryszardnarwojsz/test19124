import java.sql.SQLOutput;

public class Calculator {


    public static long sum (int a,int b){

        long resultSum = (long) a + (long) b;

        return resultSum;

    }

    public static long subtraction(int a, int b){

        long resultSubtraction = (long) a - (long) b;

        return resultSubtraction;
    }

    public static long multiplication (int a, int b){

        long resultMultiplication = (long) a * (long) b;

        return resultMultiplication;
    }

    public static double division (int a, int b){

        double resultDivision = (double) a / (double) b;

        return resultDivision;
    }


    public static void main(String[] args) {

        System.out.println(Calculator.sum(324,563));
        System.out.println(Calculator.subtraction(324,563));
        System.out.println(Calculator.multiplication(324,563));
        System.out.println(Calculator.division(324,561));
        System.out.println("calculation finish");
    }

}
