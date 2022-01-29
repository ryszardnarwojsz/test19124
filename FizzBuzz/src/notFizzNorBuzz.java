public class notFizzNorBuzz {

    public static String textNotModuloThreeFive;

    public static String checkNotModuloThreeAndFive(int number) {

        if (number % 3 != 0 & number % 5 != 0) {
            textNotModuloThreeFive = Integer.toString(number);}
        else {
            textNotModuloThreeFive = "";}

    return textNotModuloThreeFive;}
}