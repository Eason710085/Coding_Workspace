import java.io.IOException;
import java.util.Scanner;

/**
 * Assignment 2 for CS 311
 * Author: Shunjie Wan
 */
public class Driver {
  public static void main(String[] args) throws IOException {
    System.out.println("Welcome to the ADT People Database ");
    //call the Option method infinitely until user exit the program
    Option();
  }

  /**
   * Method that call the option function for the user to choose which function to operate
   * @throws IOException ioE
   */
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
    System.out.println("6. Search a person by a given year.");
    System.out.println("6. Search a person by a given day.");
    String optNum = sca.nextLine();
    switch (optNum) {
      case "0":
        //quit the program if user enter 0
        System.exit(0);
      case "1":
        //list everyone in the database
        ADTPeopleDB.BSTGenerator();
        BST.printData();
        Option();
        break;
      case "2":
        //call the add function, let user enter new person to the database
        ADTPeopleDB.addPerson();
        Option();
        break;
      case "3":
        //call the delete function, let user delete a person from the database
        ADTPeopleDB.deletePerson();
        Option();
        break;
      case "4":
        //call the modify function, let user modify a current person from database
        ADTPeopleDB.modifyPerson();
        Option();
        break;
      case "5":
        //call the search function, let user search a person by the person's born month
        ADTPeopleDB.searchPersonByMonth();
        Option();
        break;
      case "6":
        //call the search by year function, let user search a person by the person's born year
        ADTPeopleDB.searchPersonByYear();
        Option();
        break;
      case "7":
        //call the search by year function, let user search a person by the person's born year
        ADTPeopleDB.searchPersonByDay();
        Option();
        break;
      default:
        //if the user enter a wrong option, recall the Option function
        //until user enter the right number
        System.out.println("Please enter a correct number.");
        Option();
        break;
    }
  }
}
