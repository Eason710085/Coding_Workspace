package Exception;

import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Creates a file of test data that consists of ten lines each
 * containing ten integer values in the range 10 to 99.
 *
 * @author wanshunjie
 *
 */

public class ExceptionWithFinallyClause {

    /**
     * /**
     * Creates a file of test data that consists of ten lines each
     * containing ten integer values in the range 10 to 99. IOException
     * is handled.
     * @param args A string array that can hold command-line parameters
     * @throws IOException If a file can't be created
     */

    public static void main(String[] args) throws IOException {
        final int MAX = 10;
        int value;
        String file = "test.dat"; // in the project folder

        Random rand = new Random();
        FileWriter fw = null; //throws IOException
        BufferedWriter bw = null;
        PrintWriter outFile = null;

        try{
            // FileWriter constructor throws an IOException
            // either catch it or throw it
            fw = new FileWriter (file); //throws IOException
            bw = new BufferedWriter (fw);
            outFile = new PrintWriter (bw);

            for (int line = 0; line < MAX; line++){
                for (int num = 0; num < MAX; num++){
                    value = rand.nextInt (90) + 10;
                    outFile.print ((value + 1) + "   ");
                }
                outFile.println ();
            }
        } finally{
            outFile.close();
            System.out.println ("Output file has been created: " + file);

            //Open a text file.
            Runtime.getRuntime().exec("notepad test.dat");
        }

    }
}