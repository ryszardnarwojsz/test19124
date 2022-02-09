import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

    public static boolean urlCheck(String url){

        Pattern pattern = Pattern.compile("http(s|)://\\D{4,14}\\.(com|pl)");
        Matcher matcher = pattern.matcher(url);

        return matcher.matches();
    }
}
