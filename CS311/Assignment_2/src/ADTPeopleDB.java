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
   */
  public static void personInfoFinder() {
    try {
      //count the number of people in the database
      peopleNumCounter();
      //create the info array based on the number of people
      String[] Name = new String[peopleNum];
      String[] Birthday = new String[peopleNum];
      String[] PeopleInfo = new String[peopleNum];

      File file = new File("src/People.txt");
      Scanner scanner = new Scanner(file);
      for (int i = 0; i < peopleNum; i++) {
        personInfo = scanner.nextLine();
        PeopleInfo[i] = personInfo;
      }
      System.out.println(peopleNum);
      //sort the array by ASCII
      //System.out.println(Arrays.toString(PeopleInfo));
      Arrays.sort(PeopleInfo);
      //separate the name and birthday, store them in Name array and Birthday Array
      for (int i = 0; i < PeopleInfo.length; i++) {
        name = PeopleInfo[i].substring(0, PeopleInfo[i].indexOf(","));
        birthday = PeopleInfo[i].substring(name.length() + 1);
        Name[i] = name;
        Birthday[i] = birthday;
      }
      System.out.println("After sorting:");
      System.out.println(Arrays.toString(PeopleInfo));
      System.out.println(Arrays.toString(Name));
      System.out.println(Arrays.toString(Birthday));
    } catch (FileNotFoundException e) {
      System.out.println("Failed to read the text file");
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void addPerson() {

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
