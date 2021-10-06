package Exception;
import java.util.Scanner;
public class UnHandleException {

    /**
     * Demonstrate uncaught exception
     * @param args
     */
    public static void main(String[] args) {
        /**
         * demonstrate uncaught exceptions
         * @param args A string array that can hold command -line parameters
         *
         */
        Scanner input = new Scanner(System.in);
        int numerator = 10;
        int denominator = 0;
        char firstInitial = ' ';
        String firstName = "";

        //devision by zero exception
        //java/lang.ArithmeticException: /by zero
        System.out.println(numerator/denominator);
        System.out.println("This text will not be printed");

        //method charAt throws IndexOutOfBoundsException
        System.out.println("Enter your first name");
        firstName = input.nextLine();
        firstInitial = firstName.charAt(10);
        System.out.println(firstInitial);
        input.close();

    }

}
