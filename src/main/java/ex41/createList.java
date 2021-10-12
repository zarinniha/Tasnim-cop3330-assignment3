package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// created arrayList from the reading of the input file

class createList  {

    public static ArrayList<String>get_Arraylist()throws FileNotFoundException {
        File inFile = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(inFile);

        ArrayList<String> input = new ArrayList<>();
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            input.add(temp);
        }
        Collections.sort(input);
        return input;


    }
}
