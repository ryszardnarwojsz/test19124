import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {

    public static boolean peselCheck(String pesel){

        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();

    }
}
