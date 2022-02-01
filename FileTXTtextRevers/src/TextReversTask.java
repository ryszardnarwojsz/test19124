import java.io.IOException;

public class TextReversTask {

    public static void main(String[] args) throws IOException {

        String pathToFile = "FileTXTtextRevers/src/Data.txt";

        TextRevers newTextRevers = new TextRevers();

        newTextRevers.readRevert(pathToFile);

    }

}
