public class SmallCapitalLetters {

    public static void main(String[] args) {

        CapitalLettersTextFormatter newUpperCaseText = new CapitalLettersTextFormatter();
        SmallLettersTextFormatter newLowerCaseText = new SmallLettersTextFormatter();

        System.out.println(newUpperCaseText.formatText("THIS is text in capital letters"));
        System.out.println(newLowerCaseText.formatText("THIS is text in small letters"));

    }
}
