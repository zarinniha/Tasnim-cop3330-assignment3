package ex46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;

class readingString {

    //  ->reads the inputs file and creates a string of the file

    public static String readString() throws IOException {
        File inFile = new File("src/main/java/ex46/exercise46_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        StringBuilder sb = new StringBuilder(); //creates the string
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }

        String st= sb.toString();
        st=st.replace("\n"," "); /*replace the new line with space so that
                                   frequency can be count*/
        br.close();

        return st;


    }


}



