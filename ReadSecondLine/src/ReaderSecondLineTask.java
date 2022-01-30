import java.io.IOException;

public class ReaderSecondLineTask {

    public static void main(String[] args) throws IOException {

        String path = "ReadSecondLine/src/data.txt";

        FileTxtReader newFileReader = new FileTxtReader();
        newFileReader.readLine(path);
    }
}
