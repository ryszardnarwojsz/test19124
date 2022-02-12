import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumbersFromTextTask {

    public static void main(String[] args) {

        NumbersFromText newNumbersFromText = new NumbersFromText();
        List<String> newList = newNumbersFromText.createList();

        List<String> integerList = new ArrayList<>();

        for (String elementNewList : newList) {
            if (newNumbersFromText.isInteger(elementNewList) == true) {
              integerList.add(elementNewList);
            }
        }
        System.out.println(integerList);

        List<String> scientificNotationList = new ArrayList<>();

        for (String elementNewList : newList) {
            if (newNumbersFromText.isScientificNotation(elementNewList) == true) {
                scientificNotationList.add(elementNewList);
            }
        }
        System.out.println(scientificNotationList);


    }
}