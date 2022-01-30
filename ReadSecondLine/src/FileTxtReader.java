import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTxtReader {

    public void readLine(String pathToFile) throws IOException {

        try (BufferedReader newBufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            do{System.out.println(newBufferedReader.readLine());}
            while (newBufferedReader.readLine() != null);
        }
    }
}




