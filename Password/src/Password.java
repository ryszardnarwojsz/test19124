import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private static final Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?!.*2021)(?!.*21).{7,}$");

    public static boolean validatePassword(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
