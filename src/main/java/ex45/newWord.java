package ex45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class newWord {

    public static String replaceWords(String st) {
        String replaceString = st.replaceAll("utilize", "use"); //replaces the word
        return replaceString;
    }

    //prints the newer version of the string

    public static void printFile(String currentPath, String st) throws IOException {
        System.out.print("What is the output file name? ");
        Scanner sc = new Scanner(System.in);
        String output = sc.nextLine();
        String finalString = replaceWords(st);
        FileWriter outFile = new FileWriter(currentPath + output + ".txt");
        outFile.write(finalString);
        outFile.close();
    }

}
