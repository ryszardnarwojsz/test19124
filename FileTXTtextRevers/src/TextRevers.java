import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextRevers {

    public void readRevert(String pathToFile) throws IOException {

            String textFile = Files.readString(Path.of(pathToFile));
            int textFileLength = textFile.length();
            String reversText = "";

            for (int i = textFileLength; textFileLength > 0; textFileLength--) {
                char lastCharChecked = textFile.charAt(textFileLength-1);
                reversText = reversText.concat(String.valueOf(lastCharChecked));
            }

        System.out.println(reversText);
    }
}


