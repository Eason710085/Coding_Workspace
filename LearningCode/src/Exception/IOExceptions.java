package Exception;
import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Creates a file of test data that consists of ten lines each
 * containing ten integer values in the range 10 to 99.
 * @author Qi Wang
 * @version 1.0
 */
public class IOExceptions{
    /**
     * Creates a file of test data that consists of ten lines each
     * containing ten integer values in the range 10 to 99. IOException
     * is handled.
     * @param args A string array that can hold command-line parameters
     * @throws IOException If a file can't be created
     */
    public static void main (String[] args) throws IOException{
        final int MAX = 10;
        int value;
        String file = "test.dat";
        Random rand = new Random();

        //FileWriter constructor throws an IOException
        //IOException is a checked exception, it must be handled.
        //An exception can be handled here or later
        FileWriter fw = new FileWriter (file); //throws IOException
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter outFile = new PrintWriter (bw);

        for (int line = 0; line < MAX; line++){
            for (int num = 0; num < MAX; num++){
                value = rand.nextInt (90) + 10;
                outFile.print ((value + 1) + "   ");
            }
            outFile.println ();
        }

        //Open a text file at runtime.
        Runtime.getRuntime().exec("notepad test.dat");
        outFile.close();
        System.out.println ("Output file has been created: " + file);
    }
}
