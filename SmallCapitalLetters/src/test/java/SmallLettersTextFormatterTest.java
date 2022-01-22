import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallLettersTextFormatterTest {

    @Test
    void formatText() {
        //given
        String textExample = "TEXT example";
        //when
        SmallLettersTextFormatter newLowerCaseText = new SmallLettersTextFormatter();
        String smallLetterText = newLowerCaseText.formatText(textExample);
        //then
        Assertions.assertEquals("text example",smallLetterText);

    }
}