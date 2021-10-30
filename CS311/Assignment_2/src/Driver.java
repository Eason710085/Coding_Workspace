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
    Scanner sca = new Scanner(System.in);
    System.out.println("-----------------------------------------------");
    System.out.println("Please enter your choice: (just the number)");
    System.out.println("0. Quit the program.");
    System.out.println("1. List everyone in the database.");
    System.out.println("2. Enter new person to the database.");
    System.out.println("3. Delete a person from the database.");
    System.out.println("4. Modified the current person in the database.");
    System.out.println("5. Search a person by a given month.");
    String optNum = sca.nextLine();
    switch (optNum) {
      case "0":
        System.exit(0);
      case "1":
        ADTPeopleDB.BSTGenerator();
        BST.printData();
        Option();
        break;
      case "2":
        ADTPeopleDB.addPerson();
        Option();
        break;
      case "3":
        ADTPeopleDB.deletePerson();
        Option();
        break;
      case "4":
        ADTPeopleDB.modifyPerson();
        Option();
        break;
      case "5":
        ADTPeopleDB.searchPerson();
        Option();
        break;
      default:
        System.out.println("Please enter a correct number.");
        Option();
        break;
    }
  }
}
