package LoopAndFile;
import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileStatementExample {
    public static void main(String[] args) {
        int sum = 0, value, count = 0;
        double averages;
        Scanner scan  = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");

        /**compute the average of a set of values entered by the users
         * the running sum is printed as the numbers are entered
         * A string array that can hold command-line arguments
         */
        System.out.println("Enter an integer (0.###)");
        value = scan.nextInt();
        while(value != 0){//sentinel value of o to terminate loop;
            count++;
            sum = sum + value;
            System.out.println("The sum so far is " + sum);
            System.out.println("Enter an integer (0 to quit)");
            value = scan.nextInt();
            System.out.println();
        }
        if (count == 0){
            System.out.println("No values were entered");
        }else{
            averages = (double)sum/count;
            System.out.println("The average is " + fmt.format(averages));
        }
        scan.close();
    }
}