package LoopAndFile;
import java.util.Scanner;
public class DoStatement {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        int number, lastDigit, reverse = 0;
        System.out.println("Enter a postive integer: ");
        number = scan.nextInt();

        do{
            lastDigit = number % 10;
            reverse = (reverse*10) + lastDigit;
            number = number/10;
        }while (number > 0);

        System.out.println("That number reversed is " + reverse);
        scan.close();
    }
}
