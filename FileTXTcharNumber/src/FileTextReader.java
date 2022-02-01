import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileTextReader {

    public void charNumberRead(String pathToFile) throws IOException {

       String text;
       int charNumber = 0;

       try (BufferedReader newBufferedReader = new BufferedReader(new FileReader(pathToFile))) {

           while ((text = newBufferedReader.readLine()) != null) {
               charNumber = charNumber + text.length();
           }
       }
        System.out.println(charNumber);
    }
}
