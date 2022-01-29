public class Buzz {

    public static String textModuloFive;

    public static String checkModuloFive(int number) {

        if(number % 5 == 0) {
            textModuloFive = "Buzz";}
        else {
            textModuloFive = "";}

    return textModuloFive;}
}
