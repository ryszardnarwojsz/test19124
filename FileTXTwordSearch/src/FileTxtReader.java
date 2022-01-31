import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class FileTxtReader {


    public boolean containsSelectedWord(String pathTofile, String word) throws IOException {

        String text;
        boolean isContainWord = false;

        word = word.toLowerCase();

        try(BufferedReader newBufferedReader = new BufferedReader(new FileReader(pathTofile))){

            while ((text = newBufferedReader.readLine()) != null ) {
                text = text.toLowerCase();

                if(text.contains(word)){
                isContainWord = text.contains(word);

            break;
                }
            }
            return isContainWord;
        }

    }
}