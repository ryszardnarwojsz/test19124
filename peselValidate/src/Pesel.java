import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {

    private static final Pattern pattern = Pattern.compile("\\d{11}");

    public static boolean peselCheck(String pesel) {

        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();

    }
}
