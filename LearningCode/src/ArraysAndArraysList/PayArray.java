package ArraysAndArraysList;
import java.util.Scanner;

public class PayArray {
    /**
     * This program stores in an array the hours worked by five employees
     * who all make the same hourly wage.
     * @param args
     */
    public static void main(String[] args) {
        final int EMPLOYEES = 5; // number of employees;
        double payRate; 		 // Hourly pay rate;
        double grossPay;		 // Gross pay;	工资总额

        //create an array to hold employee hours;
        int[] hours = new int[EMPLOYEES];

        //create a Scanner object for user enter;
        Scanner input = new Scanner(System.in);

        //get the hours worked by each employee;
        System.out.println("Enter the hours worked by :" + EMPLOYEES + " employees who all earn "
                + "the same hourly rate");

        for (int index = 0; index < EMPLOYEES; index++)
        {
            System.out.println("Employee #" + (index + 1) +": ");
            hours[index] = input.nextInt();
        }
        //get the hourly pay rate;
        System.out.println("Enter the hourly rate for each employee: ");
        payRate = input.nextDouble();

        //display each employee's gross pay;
        System.out.println("here is each employee's gross pay");
        for(int index = 0; index < EMPLOYEES; index++)
        {
            grossPay = hours[index]*payRate;
            System.out.println("Employ#" + (index+1) + ":$" + grossPay);
        }
        input.close();

    }
}
