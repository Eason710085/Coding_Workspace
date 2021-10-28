
import java.util.Scanner;

/**
 * Assignment 2 for CS 311
 * Author: Shunjie Wan
 */
public class Driver {
  public static void main(String[] args) {
  }

  public static void Option() {
    System.out.println("Enter Y to run, N to quit");
    Scanner scanner = new Scanner(System.in);
    String option;
    option = scanner.nextLine();
    if (option.equals("Y")) {
      int optNum;
      System.out.println("Please enter your choice: (just the number)");
      System.out.println("1. List everyone in the database.");
      System.out.println("2. Enter new person to the database.");
      System.out.println("3. Search person born in a given month");
      System.out.println("4. Modified the current person in the database.");
      Scanner scan = new Scanner(System.in);
      optNum = scan.nextInt();
      try {
        switch (optNum) {
          case 1:
            System.out.println("Here is the people in the database.");
            break;
          case 2:
            System.out.println("Enter this person's Name: ");
            break;
          case 3:
            System.out.println("Enter the born month of which person you want to search:");
            break;
        }
      } catch (Exception e) {
        System.out.println("Please enter number only.");
        e.printStackTrace();
      }
    } else if (option.equals("N")) {
      System.out.println("You have exit the program.");
      System.exit(0);
    } else {
      System.out.println("Please enter correct option.");
      Option();
    }
  }
}
