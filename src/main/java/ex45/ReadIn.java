package ex45;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ReadIn {

    //reads the input file and creates a string and returns it

    public static String createString(String currentPath) throws IOException
    {
        File input = new File(currentPath+ "exercise45_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));

        StringBuilder sb = new StringBuilder(); //builds the string
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");  //keeping the new line from the input file
            line = br.readLine();
        }

        String st= sb.toString();
        br.close();

        return st;

    }

}
