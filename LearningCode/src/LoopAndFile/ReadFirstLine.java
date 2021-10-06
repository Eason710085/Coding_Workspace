package LoopAndFile;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFirstLine {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        //get the file name
        System.out.println("Enter the file name: ");
        String filename = scan.nextLine();

        //open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // read the first line from the file
        String line = inputFile.nextLine();

        //display the line
        System.out.println("The first line in the file is :");
        System.out.println(line);
        //close the file
        inputFile.close();
        scan.close();
    }
}
