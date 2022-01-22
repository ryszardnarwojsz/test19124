public class SmallCapitalLetters {

    public static void main(String[] args) {

        CapitalLetters newUpperCaseText = new CapitalLetters();
        SmallLetters newLowerCaseText = new SmallLetters();

        System.out.println(newUpperCaseText.formatText("THIS is text in capital letters"));
        System.out.println(newLowerCaseText.formatText("THIS is text in small letters"));

    }
}
