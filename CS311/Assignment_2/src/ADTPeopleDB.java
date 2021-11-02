import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Read the People database from the People.txt file, Extract the name and birthday
 */
public class ADTPeopleDB {

  //find the person's information, including name and birthday
  public static String personInfo = null;

  /**
   * Method that extract personInfo from the file
   * add all the data to the BST, generate the tree
   */
  public static void BSTGenerator() {
    try {
      //read the file, extract the person info
      BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
      //put all the person info to the bst tree
      while ((personInfo = reader.readLine()) != null) {
        //count the number of people
        BST.insert(personInfo);
      }
      //catch the exception
    } catch (FileNotFoundException e) {
      System.out.println("Failed to read the text file");
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Add new person to the file
   * Format: Name-MM/DD/YYYY
   *
   * @throws IOException e
   */
  public static void addPerson() throws IOException {
    System.out.println("Enter the Name and birthday in the format of: Name-MM/DD/YYYY");
    System.out.println("Example: Jay Lee-03/13/2004 ");
    String person;
    Scanner scanner = new Scanner(System.in);
    person = scanner.nextLine();
    BufferedWriter writer = new BufferedWriter(new FileWriter("src/People.txt", true));
    writer.write(person);
    //regenerate the tree
    BSTGenerator();
    writer.newLine();
    //close the file
    writer.close();
    System.out.println("PersonInfo successfully added to ADT.");
  }


  /**
   * delete the person from the file
   *
   * @throws IOException exception
   */
  public static void deletePerson() throws IOException {
    //read the file
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    //put the origin data to the buffer Arraylist
    ArrayList<String> buffer = new ArrayList<>();
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    //let user enter the person which they want to delete
    System.out.println("Enter the personInfo you want to delete from database.");
    System.out.println("Example: Shunjie Wan,06/11/2001");
    String deletion;
    Scanner scan = new Scanner(System.in);
    deletion = scan.nextLine();
    //check the BST, if the information match, delete the person
    if (buffer.contains(deletion)) {
      buffer.remove(deletion);
      System.out.println("Successfully deleted.");
    } else {
      System.out.println("There is no such person in the database");
    }
    //rewrite the data which after deleting to the file
    BufferedWriter reWrite = new BufferedWriter(new FileWriter("src/People.txt"));
    for (String s : buffer) {
      reWrite.write(s);
      reWrite.newLine();
    }
    reWrite.close();
    //regenerate the tree
    BSTGenerator();
  }

  /**
   * Modify the person info
   *
   * @throws IOException e
   */
  public static void modifyPerson() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    //let the user enter the person's info to modify it
    System.out.println("Enter the personInfo to modify: ");
    System.out.println("Example: Shunjie Wan,06/11/2001");
    Scanner scanner = new Scanner(System.in);
    String personModified = scanner.nextLine();
    //if their is a match in the database, let the user modify it
    if (buffer.contains(personModified)) {
      int index = buffer.indexOf(personModified);
      System.out.println("Enter the updated information: ");
      String modify = scanner.nextLine();
      buffer.set(index, modify);
      //rewrite the data which has been modified to the file
      BufferedWriter reWrite = new BufferedWriter(new FileWriter("src/People.txt"));
      for (String s : buffer) {
        reWrite.write(s);
        reWrite.newLine();
      }
      reWrite.close();
      System.out.println("Information Update Successfully.");
    } else {
      //tell the user there is no this person in the database
      System.out.println("There is no such person in the database");
    }
  }

  /**
   * Method that let user search the data by year.
   *
   * @throws IOException e
   */
  public static void searchPersonByYear() throws IOException {
    //let the user enter a year they want to search
    System.out.println("Search a person by year: (Example: 2001) ");
    Scanner sr = new Scanner(System.in);
    String year = sr.nextLine();
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    //if there is a match, print out the person's info from the database
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    for (String value : buffer) {
      if (year.equals(value.substring(value.length() - 4))) {
        System.out.println("This person is: " + value);
      }
    }
  }

  /**
   * Method that let user search the people by month
   *
   * @throws IOException e
   */
  public static void searchPersonByMonth() throws IOException {
    System.out.println("Search a person by month: ");
    System.out.println("Include '0' if the month is less than 10! Example: 05 ");
    //let the user enter the month which they want to search
    Scanner s = new Scanner(System.in);
    String month = s.nextLine();
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    //search the database by month, if match, print out the person's information
    for (String value : buffer) {
      if (month.equals(value.substring(value.length() - 10, value.length() - 8))) {
        System.out.println("This person is: " + value);
      }
    }
  }

  /**
   * Method that let user search the data by day.
   *
   * @throws IOException e
   */
  public static void searchPersonByDay() throws IOException {
    //let the user enter a year they want to search
    System.out.println("Search a person by Day: (Example: 11) ");
    System.out.println("Include '0' if the day is less that 10! Example: 02 ");
    Scanner sr = new Scanner(System.in);
    String day = sr.nextLine();
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    //if there is a match, print out the person's info from the database
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    for (String value : buffer) {
      if (day.equals(value.substring(value.length() - 7,value.length() - 5))) {
        System.out.println("This person is: " + value);
      }
    }
  }
}
