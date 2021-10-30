import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Read the People database from the People.txt file, Extract the name and birthday
 */
public class ADTPeopleDB {
  //find the number of the people in the database, initialized to 0,

  //find the person's information, including name and birthday
  public static String personInfo = null;
  //extract the name from personInfo
  public static String name = null;
  //extract the birthday from personInfo
  public static String birthday = null;

  /**
   * Method that extract personInfo from the file
   * add all the data to the BST, generate the tree
   * find the name and birthday
   */
  public static void BSTGenerator() {
    try {
      //read the file
      BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
      while ((personInfo = reader.readLine()) != null) {
        //count the number of people
        BST.insert(personInfo);
      }
//    reader.close();
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
    BSTGenerator();
    writer.newLine();
    writer.close();
    System.out.println("PersonInfo successfully added to ADT.");
  }


  public static void deletePerson() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    System.out.println("Enter the personInfo you want to delete from database.");
    String deletion;
    Scanner scan = new Scanner(System.in);
    deletion = scan.nextLine();
    if (buffer.contains(deletion)) {
      buffer.remove(deletion);
      System.out.println("Successfully deleted.");
    } else {
      System.out.println("There is no such person in the database");
    }
    BufferedWriter reWrite = new BufferedWriter(new FileWriter("src/People.txt"));
    for (String s : buffer) {
      reWrite.write(s);
      reWrite.newLine();
    }
    reWrite.close();
    BSTGenerator();
  }

  public static void modifyPerson() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    System.out.println("Enter the personInfo to modify: ");
    Scanner scanner = new Scanner(System.in);
    String personModified = scanner.nextLine();
    if (buffer.contains(personModified)) {
      int index = buffer.indexOf(personModified);
      System.out.println("Enter the updated information: ");
      String modify = scanner.nextLine();
      buffer.set(index, modify);
      BufferedWriter reWrite = new BufferedWriter(new FileWriter("src/People.txt"));
      for (String s : buffer) {
        reWrite.write(s);
        reWrite.newLine();
      }
      reWrite.close();
      System.out.println("Information Update Successfully.");
    } else {
      System.out.println("There is no such person in the database");
    }
  }

  public static void searchPerson() throws IOException {
    System.out.println("Search a person by month: ");
    Scanner s = new Scanner(System.in);
    String month = s.nextLine();
    BufferedReader reader = new BufferedReader(new FileReader("src/People.txt"));
    ArrayList<String> buffer = new ArrayList<>();
    while ((personInfo = reader.readLine()) != null) {
      buffer.add(personInfo);
    }
    for (String value : buffer) {
      if (month.equals(value.substring(value.length() - 10, value.length() - 8))) {
        System.out.println("This person is: " + value);
      }
    }
  }
}
