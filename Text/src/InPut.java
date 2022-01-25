import java.util.Scanner;

public class InPut {

    public static String textInputByUser() {
        System.out.println("Please place example text:");
        Scanner newScan = new Scanner(System.in);
        String userText = newScan.nextLine();
        return userText;

    }
}