import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextReader {

    public String intoCapitalLetters(String pathTofile) throws IOException {

        String text = Files.readString(Path.of(pathTofile));
        return text.toUpperCase();
    }

}