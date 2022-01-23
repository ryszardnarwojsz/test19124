public class SmallLettersTextFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
