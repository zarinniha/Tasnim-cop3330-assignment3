package ex45;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadInTest {

    @Test
    void createString() throws IOException {

        String answer="One should never utiliz45e the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".\n";

        String currentPath="src/main/java/ex45/";

        ReadIn test1= new ReadIn();
        String result = test1.createString(currentPath);
        assertEquals(result,answer);
    }
}