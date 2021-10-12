package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
class createHTMLTest {

    @Test
    void websiteExists() {

        File file1 = new File("src/test/java/ex43/createHTMLTest.java");
        File file2 = new File("src/test/java/ex43/assignemt3.java");

        createHTML test = new createHTML();
        boolean result1= test.websiteExists(file1);
        boolean result2= test.websiteExists(file2);

        assertEquals(false,result1);
        assertEquals(true,result2);
    }
}