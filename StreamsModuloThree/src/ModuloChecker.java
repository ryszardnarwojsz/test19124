import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModuloChecker {

    public static List<Integer> checkModuloThree(IntStream stream) {
        List<Integer> listModuloThree = stream
                .filter(i -> i % 3 == 0)
                .boxed()
                .collect(Collectors.toList());

        return listModuloThree;

    }

}



