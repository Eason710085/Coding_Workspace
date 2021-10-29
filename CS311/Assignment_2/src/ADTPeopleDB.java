import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Read the People database from the People.txt file, Extract the name and birthday
 */
public class ADTPeopleDB {
  //find the number of the people in the database, initialized to 0,
  public static int peopleNum = 0;
  //find the person's information, including name and birthday
  public static String personInfo = null;
  //extract the name from personInfo
  public static String name = null;
  //extract the birthday from personInfo
  public static String birthday = null;

  public static void main(String[] args) {
    personInfoFinder();
  }

  /**
   * Method that read the number of people in the people database
   *
   * @throws IOException IOException, file no found
   */
  public static void peopleNumCounter() throws IOException {
    //read the file
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    while (reader.readLine() != null) {
      //count the number of people
      peopleNum++;
    }
    reader.close();
  }

  /**
   * Method that extract personInfo from the file
   * add all the data to the BST, generate the tree
   * find the name and birthday
   */
  public static void personInfoFinder() {
    try {
      //count the number of people in the database
      peopleNumCounter();
      File file = new File("src/People.txt");
      Scanner scan = new Scanner(file);
      for (int i = 0; i < peopleNum; i++) {
        personInfo = scan.nextLine();
        BST.insert(personInfo);
      }
      scan.close();
    } catch (FileNotFoundException e) {
      System.out.println("Failed to read the text file");
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


  public static void addPerson() throws IOException {
    System.out.println("Enter the Name and birthday in the format of: Name-MM/DD/YYYY");
    System.out.println("Example: Jay Lee-03/13/2004 ");
    String person;
    Scanner scanner = new Scanner(System.in);
    person = scanner.nextLine();
    BufferedWriter writer = new BufferedWriter(new FileWriter("src/People.txt", true));
    writer.write(person);
    personInfoFinder();
    writer.newLine();
    writer.close();
    scanner.close();
    System.out.println("PersonInfo successfully added to ADT.");
  }

  public static void deletePerson() {

  }

  public static void modifyPerson() {

  }

  public static void searchPerson() {

  }

  public static void databaseTraversal() {
  }
}
