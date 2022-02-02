import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToCapitalLetterTask {

    public static void main(String[] args) throws IOException {

        String pathTofile = "FileTXTtoCapitalLetters/src/Data.txt";
        String pathTofileOut = "FileTXTtoCapitalLetters/src/output.txt";

        TextReader newTextReader = new TextReader();
        String UpperCaseText = newTextReader.intoCapitalLetters(pathTofile);

        Files.writeString(Paths.get(pathTofileOut), UpperCaseText);

    }
}
