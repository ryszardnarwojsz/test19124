import java.util.Objects;
import java.util.Scanner;

public class Text {

    private String userText;

    public Text(String userText) {
        this.userText = userText;
    }

    public boolean isBlank(){
        return userText.isBlank();
    }

    public void palindromCheck() {

        char[] charsArray = userText.toCharArray();
        StringBuilder reversUserText = new StringBuilder();

        for (int i = charsArray.length - 1; i >= 0; i--) {
            reversUserText.append(charsArray[i]);
        }

        if ((reversUserText.toString()).equals(userText)) {
            System.out.println("Your string is Palindrome");
        } else {
            System.out.println("Your string is not Palindrome");
        }
    }

    public void textLength(){
        System.out.println("Your text has: "+ userText.length() + " chars");
    }

}
