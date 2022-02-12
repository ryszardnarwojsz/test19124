import java.util.List;
import java.util.stream.IntStream;

public class StreamsModuloThreeTask {

    public static void main(String[] args) {

        IntStream streamNumbers = IntStream.range(45, 78);

        List<Integer> listModuloThree = ModuloChecker.checkModuloThree(streamNumbers);

        listModuloThree.stream()
                .forEach(i -> System.out.println(i));
        }
}
