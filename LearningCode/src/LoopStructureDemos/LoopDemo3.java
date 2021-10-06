package LoopStructureDemos;

import java.util.Scanner;

public class LoopDemo3 {

    public static void main(String[] args) {
        //create loop to print a list of number;
        double amount = 0;
        int tries = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a monetary amount: ");
        amount = scan.nextDouble();
        tries ++;

        //input validation
        while (amount <9 && tries <3)
        {
            System.out.println("Enter a monetary amount: ");
            amount=scan.nextDouble();
            tries ++;
        }
        scan.close();
    }

}
