package DecisionStructures;
import java.util.Scanner;
public class LoanQualifier {
    /**
     * This program demonstrates a nested if statement
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double salary; //annual salary;
        double yearsOnJob; // years at current job;

        //create a scanner object for user enter
        Scanner input = new Scanner(System.in);

        //get the user's annual salary
        System.out.println("Enter your annual salary: ");
        salary = input.nextDouble();

        //get the numbers of year at the current job
        System.out.println("Enter the number of years " + "at your current job: ");
        yearsOnJob = input.nextDouble();

        //determine whether the user qualifies for loan
        if (salary >= 50000)
        {
            if(yearsOnJob >=2)
            {
                System.out.println("you qualify for the loan");
            }
            else
            {
                System.out.println("you must have been on your current job for at least two years to qualify");
            }
        }
        else
        {
            System.out.println("you must earn at least $50,000 per year to qualify");
        }
        input.close();
    }

}

