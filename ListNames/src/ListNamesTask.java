import java.util.*;

public class ListNamesTask {

    public static void main(String[] args) {

        List<String> listOfNames = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        Set<String> setOfNames = Set.copyOf(listOfNames);

        System.out.println(setOfNames);
        Collections.reverse(listOfNames);
        System.out.println(listOfNames);

        String oldName ="Anna";
        String newName ="Joanna";

        Collections.replaceAll(listOfNames,oldName,newName);
        System.out.println(listOfNames);

   }
}



