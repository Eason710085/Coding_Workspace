package Exception;
import java.util.Scanner;
/*
 * Demonstrate uncaught exception
 */
public class ExceptionThrown2 {

    /**
     * demonstrate catching exception
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

            input.close();
        }catch (ArithmeticException ae){
            throw new ArithmeticException("Division by zero");
        }catch (IndexOutOfBoundsException ie){
            throw new IndexOutOfBoundsException("The index is out of bound.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}