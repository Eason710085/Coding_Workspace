package LoopAndFile;
import java.util.Scanner;
import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {
        /**
         * it is a dead loop
         */
		/*Some applications, such as games and simulations, require the use of randomly generated numbers.
		• The Java API has a class, Random, for this purpose. To use the Random class,
		use the following import statement and create an instance of the class.

		import java.util.Random;
		Random randomNumbers = new Random();
		*/
        String again = "y";
        int die1,die2;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //simulate rolling the dice;
        while (again.equalsIgnoreCase("y")){
            System.out.println("Rolling the dice.....");
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            System.out.println("Their values are: " + die1 + "" + die2);
            System.out.println("Enter \'y\' to rolling again, \'n\' to quit");
        }
        input.close();
    }
}