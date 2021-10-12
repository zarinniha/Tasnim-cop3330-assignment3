package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newWordTest {

    @Test
    void replaceWords() {

        String st="One should never utilize the word \"utilize\" in writing.";
        newWord test1 = new newWord();
        String result = test1.replaceWords(st);

        String answer="One should never use the word \"use\" in writing.";

        assertEquals(result,answer);
    }
}