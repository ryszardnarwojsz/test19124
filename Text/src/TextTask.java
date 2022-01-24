import java.util.Objects;
import java.util.Scanner;

public class TextTask {

    public static void main(String[] args) {

      Text newText = new Text(InPut.textInputByUser());

      if (!newText.isBlank()) {
          newText.palindromCheck();
          newText.textLength();
      }
      else {
          System.out.println("You did not input any chars");
      }

    }
}
