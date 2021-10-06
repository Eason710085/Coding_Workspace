package DecisionStructures;
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        /**
         * this program demonstrates the if-else statement
         */
        double number1, number2;
        double quotient; //result of devision

        //create a scanner object for user input
        Scanner input = new Scanner(System.in);

        //get the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        //get the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        if (number2 ==0)
        {
            System.out.println("Division by zero is not possible");
            System.out.println("Please run the program again");
            System.out.println("Enter a number other than zero");
        }
        else
        {
            quotient = number1/number2;
            System.out.print("The quotient of " + number1);
            System.out.print(" divided bu " + number2);
            System.out.print(" is:" + quotient);
        }
        input.close();
    }

}
