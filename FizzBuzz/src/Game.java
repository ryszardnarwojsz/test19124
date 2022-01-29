public class Game {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(Fizz.checkModuloThree(i)
                               + Buzz.checkModuloFive(i)
                               + notFizzNorBuzz.checkNotModuloThreeAndFive(i));
        }
    }
}