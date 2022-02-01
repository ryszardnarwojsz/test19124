import java.io.File;
import java.io.IOException;

public class FileTxtReadTask {

    public static void main(String[] args) throws IOException {

        String pathTofile = "FileTxtRead/src/data.txt";
        File newFile = new File(pathTofile);

        FileReader newFileReader = new FileReader();
        newFileReader.readFileOnConsole(pathTofile);


    }
}
