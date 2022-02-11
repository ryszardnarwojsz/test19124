import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromText {

    public List<String> createList() {

        List<String> listOfNumbers = new ArrayList<>();

        String pathTofile = "NumbersFromText/src/Text.txt";

        try {
            BufferedReader newBufferedReader = new BufferedReader(new FileReader(pathTofile));
            String singleLine = newBufferedReader.readLine();

            while (newBufferedReader.readLine() != null) {

                if (!singleLine.equals("")) {
                    listOfNumbers.add(singleLine);
                }
                singleLine = newBufferedReader.readLine();
            }
            newBufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(listOfNumbers);
        return listOfNumbers;
    }

    public boolean isInteger(String number) {

        Pattern pattern = Pattern.compile("\\d{1,1000000000}");
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public boolean isFloating(String number) {

        Pattern pattern = Pattern.compile("\\d{1,1000000000}\\.\\d{1,1000000000}");
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public boolean isScientificNotation(String number) {

        Pattern pattern = Pattern.compile("\\d{1,1000000000}\\.\\d{1,1000000000}(e|E)(\\+|\\-)\\d{1,2}");
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

}
