package DecisionStructures;
import java.util.Scanner;
public class SecretWord {
    /**
     * this program demonstrates a case insensitive string comparison;
     * @param args
     */
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        String input;
        // Prompt the user to enter the secret word.
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();

        // Determine whether the user entered the secret word.
        if (input.equalsIgnoreCase("PROSPERO"))
        {
            System.out.println("Congratulations! You know the " +
                    "secret word!");
        }
        else
        {
            System.out.println("Sorry, that is NOT the " +
                    "secret word!");
        }
        keyboard.close();
    }
}