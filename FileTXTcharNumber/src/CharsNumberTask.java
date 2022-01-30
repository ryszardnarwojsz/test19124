import java.io.File;
import java.io.IOException;

public class CharsNumberTask {

    public static void main(String[] args) throws IOException {

        String path = "FileTXTcharNumber/src/data.txt";
        File newFile = new File(path);
        FileTextReader newFileTextReader = new FileTextReader();
        newFileTextReader.charNumberRead(path);

    }
}
