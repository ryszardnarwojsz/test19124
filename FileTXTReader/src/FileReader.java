import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public void readFileOnConsole(String pathToFile) throws IOException {
        String textRead = Files.readString(Path.of(pathToFile));
        System.out.println(textRead);
    }
}
