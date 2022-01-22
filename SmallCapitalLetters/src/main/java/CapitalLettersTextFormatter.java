public class CapitalLettersTextFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
