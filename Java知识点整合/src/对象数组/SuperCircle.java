package 对象数组;
import java.util.Scanner;

public class SuperCircle {
    public static void main(String[] args) {
        System.out.println("please enter a word: ");
        while (true) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            if (word.equals("handsome")) {
                System.out.println("yes, the secret phrase is： "+ word);
                System.exit(1);
            } else if (word.equals("stop")) {
                System.exit(0);
            } else {
                System.out.println("please enter a new word:");
            }
        }
    }
}