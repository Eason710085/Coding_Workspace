package LoopAndFile;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class HasNextMethod {
    public static void main(String[] args) throws IOException {

		/*read friends information form a filr
		file name is Friends.txt
		Doe
		Rase
		Grey
		Kirk*/
        File file = new File("Friends.txt");
        Scanner inputFile = new Scanner(file);

        String line;

        //check if there is more file in the line
        while (inputFile.hasNext()) {
            line = inputFile.nextLine();
            System.out.println(file);
        }
        inputFile.close();
    }
}

