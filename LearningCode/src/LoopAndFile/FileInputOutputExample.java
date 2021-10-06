package LoopAndFile;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

import java.io.File;

public class FileInputOutputExample {
    public static void main(String[] args) throws FileNotFoundException {
        /**write friends' information into a file
         *
         */
        String fileName, friendName;
        int numberOfFriends;
        PrintWriter outputfile;

        Scanner input = new Scanner(System.in);

        //read the number of friends
        System.out.println("How mant friends do you have?: ");
        numberOfFriends = input.nextInt();
        //Skip the remaining newline character
        input.nextLine();

        //read the filename
        System.out.println("Enter the file name ");
        fileName = input.nextLine();

        //make sure the file does not exist
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("the File " + fileName +"already exists");
            System.exit(0);
        }

        //open the  file
        outputfile = new PrintWriter(fileName);

        //get data and write it to the file
        for (int i = 0; i < numberOfFriends; i++){
            System.out.println("Enter the name of friend " + "number " + (i+1)+ ":");
            friendName = input.nextLine();
            //write the name to the file
            outputfile.println(friendName);
        }
        //close the file
        outputfile.close();
        input.close();
        System.out.println("Data written to the file");

    }
}
