package ArraysAndArraysList;

import java.util.Scanner;

public class ArrayDemo1 {
    /** this program show values being stored in an array;
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int EMPLOYEES = 3;

        int [] hours = new int [EMPLOYEES];

        System.out.println("Enter the hours work by "+ EMPLOYEES +" employee.");
        // Get the hours worked by employee 1;
        System.out.print("Employee 1: ");
        hours[0] = input.nextInt();

        //get the hours worked by employee 2;
        System.out.print("Employee 2: ");
        hours[1] = input.nextInt();
        //get the hours worked by employee3;
        System.out.print("Employee 3: ");
        hours[2] = input.nextInt();

        //display the values entered;
        System.out.println("the hours you entered are:");
        System.out.print(hours[0] +"\t");
        System.out.print(hours[1]+"\t");
        System.out.println(hours[2]+"\t");
        for (int index=0; index<EMPLOYEES; index++)
        {
            System.out.println("Employee " + (index+1)+ " works " + hours[index] + " hours");
        }
        input.close();
    }

}