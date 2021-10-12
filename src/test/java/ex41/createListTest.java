package ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class createListTest {

    @Test
    void get_Arraylist() throws FileNotFoundException {
        int i = 0;
        createList test = new createList();
        File inFile = new File("src/main/java/ex41/exercise41_input.txt");

        Scanner sc1 = new Scanner(inFile);
        while (sc1.hasNextLine()) {
            String temp = sc1.nextLine();
            i++;
        }

        ArrayList<String> result = test.get_Arraylist();
        assertEquals(result.size(), i);
    }
}