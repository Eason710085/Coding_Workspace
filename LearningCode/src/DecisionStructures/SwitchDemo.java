package DecisionStructures;
import java.util.Scanner;
public class SwitchDemo {
    /**
     * this program demonstrates the switch statement
     * @param args
     */
    public static void main(String[] args) {
        int number ;// a number enter by customer

        Scanner scan = new Scanner(System.in);

        //get one of the number 1,2, or 3 from the user;
        System.out.println("Enter number1,2,3:");
        number = scan.nextInt();

        //determine the number entered;
        switch (number)
        {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("That's not 1,2,3");

        }
        scan.close();}

}