import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileData {

    public void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void readFile(String pathToFile) throws IOException {
        String textRead = Files.readString(Path.of(pathToFile));
        System.out.println(textRead);
    }

}
