import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallLettersTest {

    @Test
    void formatText() {
        //given
        String textExample = "TEXT example";
        //when
        SmallLetters newLowerCaseText = new SmallLetters();
        String CapitalLetterText = newLowerCaseText.formatText(textExample);
        //then
        Assertions.assertEquals(0,CapitalLetterText.compareTo("text example"));

    }
}