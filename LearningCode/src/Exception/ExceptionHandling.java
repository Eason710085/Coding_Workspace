package Exception;
/*
 * demonstrate uncaught exception
 */
import java.util.Scanner;
public class ExceptionHandling {
    /**
     * Demonstrates uncaught exceptions.
     * @param args A string array that can hold command-line parameters
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator = 10;
        int denominator = 0;
        char firstInitial = ' ';
        String firstName = "";

        try{
            //Division by zero exception
            //java.lang.ArithmeticException: / by zero
            System.out.println (numerator / denominator);
            System.out.println ("This text will not be printed.");

            //Method charAt throws IndexOutOfBoundsException
            System.out.println("Enter your first name");
            firstName = input.nextLine();
            firstInitial = firstName.charAt(7);
            System.out.println(firstInitial);
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        input.close();
    }
}