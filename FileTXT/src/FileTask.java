import java.io.File;
import java.io.IOException;

public class FileTask {

    public static void main(String[] args) throws IOException {

        String textTofile = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";

        String fileName = "data.txt";
        String pathTofile = "FileTXT/src/" + fileName;

        File file = new File(pathTofile);
        FileData newFileData = new FileData();

        newFileData.writeToFile(pathTofile,textTofile);

        newFileData.readFile(pathTofile);

        }


 }

