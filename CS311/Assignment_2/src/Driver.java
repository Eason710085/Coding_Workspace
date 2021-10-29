
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.io.IOException;
import java.util.Scanner;

/**
 * Assignment 2 for CS 311
 * Author: Shunjie Wan
 */
public class Driver {
  public static void main(String[] args) throws IOException {
    Option();
  }

  public static void Option() throws IOException {
    System.out.println("Enter Y to run, N to quit");
    Scanner scanner = new Scanner(System.in);
    String option;
    option = scanner.nextLine();
    if (option.equals("Y")) {
      System.out.println("-----------------------------------------------");
      System.out.println("Please enter your choice: (just the number)");
      System.out.println("1. List everyone in the database.");
      System.out.println("2. Enter new person to the database.");
      System.out.println("3. Search person born in a given month");
      System.out.println("4. Modified the current person in the database.");
      int optNum = scanner.nextInt();
      if (optNum == 1) {
        ADTPeopleDB.personInfoFinder();
        BST.printData();
      } else if (optNum == 2) {
        ADTPeopleDB.addPerson();
      } else if (optNum == 3) {

      } else if (optNum == 4) {

      } else {

      }
    }
  }
}
