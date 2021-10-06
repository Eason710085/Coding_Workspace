package LoopAndFile;
import java.util.Scanner;
import java.io.*;

public class FileWriteDataDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * this program writes data to a file
         * @param args
         * @throws IOException
         */
        String filename; //filename
        String friendName; //friend's name
        int numFriends; // number of friends

        Scanner scan = new Scanner(System.in);

        //get the number of friends
        System.out.println("How namy friends do you have");
        numFriends = scan.nextInt();

        //consume the remaining newline character
        scan.nextLine();

        //get the file name
        System.out.println("Enter the file name:");
        filename = scan.nextLine();

        //open the file
        PrintWriter outputFile = new PrintWriter(filename);

        //get data and write it into file
        for (int index = 0; index<numFriends; index++)
        {
            System.out.print("Enter the name of friend " + "number " + index +":");
            friendName = scan.nextLine();
            //write the name into the file
            outputFile.println(friendName);
        }
        //close the file
        scan.close();
        outputFile.close();
        System.out.println("data written to the file");
    }
}
