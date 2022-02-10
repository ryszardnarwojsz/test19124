import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

    private final static Pattern pattern = Pattern.compile("http(s|)://\\D{4,14}\\.(com|pl)");

    public static boolean urlCheck(String url){

        Matcher matcher = pattern.matcher(url);

        return matcher.matches();
    }
}
