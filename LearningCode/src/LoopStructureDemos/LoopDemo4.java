package LoopStructureDemos;
import java.util.Scanner;

public class LoopDemo4 {

    public static void main(String[] args) {
        //create loop to print a list of number

        double amount = 0;
        int tires = 0 ;
        Scanner input = new Scanner(System.in);

        //input validation
        do
        {
            System.out.println("Enter a monetary amount: ");
            amount = input.nextDouble();
            tires++;
        }while(amount < 10 && tires <3);

        //close the input
        input.close();


    }

}