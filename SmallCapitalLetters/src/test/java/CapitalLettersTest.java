import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CapitalLettersTest {

    @Test
    void formatText() {
        //given
        String textExample = "TEXT example";
        //when
        CapitalLetters newUpperCaseText = new CapitalLetters();
        String CapitalLetterText = newUpperCaseText.formatText(textExample);
        //then
        Assertions.assertEquals(0,CapitalLetterText.compareTo("TEXT EXAMPLE"));
            }
    }



