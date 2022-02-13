import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfLettersTask {

    public static void main(String[] args) {

        List<String> newList = List.of("new","home","car","room","tree","lamp","home","new");

        newList
                .stream()
                .map(String::toUpperCase)
                .map(String::chars)
                .flatMap(s -> s.mapToObj(n ->  (char)n))
                .distinct()
                .forEach(System.out::println);
    }

}
