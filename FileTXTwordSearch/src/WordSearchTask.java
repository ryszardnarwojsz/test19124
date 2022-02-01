import java.io.File;
import java.io.IOException;

public class WordSearchTask {

    public static void main(String[] args) throws IOException {

        String path = "FileTXTwordSearch/src/Data.txt";

        FileTxtReader newFileTxtReader = new FileTxtReader();
        System.out.println(newFileTxtReader.containsSelectedWord(path,"File"));



    }
}
