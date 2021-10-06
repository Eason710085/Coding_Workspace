package ArraysAndArraysList;

import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        /** this program shows an array being processed with loop
         *
         */
        final int EMPLOYEES = 3; //numbers of employees
        int [] hours = new int[EMPLOYEES];

        //create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hours worked by "+
                EMPLOYEES+ " emplpyee" );

        //get the hours for each employee
        for (int index = 0; index< EMPLOYEES; index++)
        {
            System.out.print("Employees "+(index+1) + ":");
            hours[index] = input.nextInt();
        }
        System.out.println("The hours you entered are: ");
        for (int index=0;index<EMPLOYEES;index++)

            System.out.println(hours[index]);
        input.close();
    }
}
