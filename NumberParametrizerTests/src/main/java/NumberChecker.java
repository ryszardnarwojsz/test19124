public class NumberChecker {

    public static boolean isModuloTwo(int number){
        return (number % 2 == 0);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
