package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//prints the sorted arrayList if the input file exists,
// if not it prints an error

public class printAnswer {

    public static void printList(ArrayList<String> input) throws IOException
    {
        FileWriter outFile = new FileWriter("src/main/java/ex41/exercise41_output.txt");

        outFile.write("Total of "+input.size()+" names"+"\n");
        outFile.write("----------------"+"\n");

        try{
            for(int i=0;i<input.size();i++)
            {
                outFile.write(input.get(i)+"\n");
            }
            outFile.close();
        }catch(Exception e)
        {
            System.out.print("there is no file.");
        }

    }

}
