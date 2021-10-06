package Classes;
import java.util.Scanner;
import java.util.Random;
import java.io.*; //needed for file I/O classes
public class ObjectDemo {
    /**
     * This program writes random numbers to a file
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        int maxNumber; //max number of random numbers
        int numbers; //to hold a random number

        //create a scanner object for input
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        //create a printwriter object to open the file
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        //get the number of random numbers to writer
        System.out.println("How many random numbers should i write? ");
        maxNumber =scan.nextInt();

        //Writer the random numners to the file
        for (int count = 0; count < maxNumber; count++)
        {
            //generator a random integer
            numbers = rand.nextInt();
            //write the random integer to the file
            outputFile.println(numbers);
        }
        //close the file
        outputFile.close();
        System.out.println("Done");
        scan.close();
    }

}
