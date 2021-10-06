package DecisionStructures;
import java.util.Scanner;

public class IfAverageScore {
    /**
     * this program demonstrates the if statement
     * @param args
     */
    public static void main(String[] args) {
        double score1,
                score2,
                score3,
                average;

        //create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("this program average 3 test scores");

        //get the first score
        System.out.print("Enter the first score: ");
        score1	= input.nextDouble();

        //get the second score
        System.out.print("Enter the second score:");
        score2 = input.nextDouble();

        //get the third score
        System.out.print("Enter the third score:");
        score3= input.nextDouble();

        //calculate and display the average score
        average = (score1 + score2+ score3)/3.0;
        System.out.println("The average is " + average);

        // if the average is higher that 95, congratulate the user
        if(average>95)
            System.out.println("你好牛逼哦");

        if (average<80)
            System.out.println("垃圾");
        input.close();

    }

}
