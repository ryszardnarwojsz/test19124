public class SquareRoot {


    public double squareCalculate(double number) {
        if (number < 0){
            throw new IllegalArgumentException("argument < 0");
        }
        return Math.sqrt(number);
    }

}
