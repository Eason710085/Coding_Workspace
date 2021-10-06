package ArraysAndArraysList;
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double [3];
        System.out.println("THe size of the array: " + numbers.length);

        //Store user-entered inputs in order
        for (int index=0; index<numbers.length; index++)
        {
            System.out.println("Enter number "+ (index+1)+ ":");
            numbers[index] = input.nextDouble();
        }
        System.out.println("The number in reverse order: ");

        //Display the inputs in reverse order. the indices should be from length -1 to 0.
        for (int index = numbers.length-1; index >= 0; index--)
        {
            System.out.println(numbers[index] );
        }
        input.close();
    }
}
