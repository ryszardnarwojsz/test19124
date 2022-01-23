import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CapitalLettersTextFormatterTest {

    @Test
    void formatText() {
        //given
        String textExample = "TEXT example";
        //when
        CapitalLettersTextFormatter newUpperCaseText = new CapitalLettersTextFormatter();
        String capitalLetterText = newUpperCaseText.formatText(textExample);
        //then
        Assertions.assertEquals("TEXT EXAMPLE",capitalLetterText);
            }
    }



