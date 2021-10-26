import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Assignment 2 for CS 311
 * Author: Shunjie Wan
 */
public class Driver {
  public static String personInfo = null;
  public static String name = null;
  public static String birthday = null;

  public static void main(String[] args) {
    personInfoFinder();
  }

  public static void personInfoFinder() {
    try {
      File file = new File("src/People.txt");
      Scanner scanner = new Scanner(file);
      String[] Name = new String[20];
      String[] Birthday = new String[20];
      String[] PeopleInfo = new String[20];

      //20 person in the database
      int peopleNum = 20;
      for (int i = 0; i < peopleNum; i++) {
        personInfo = scanner.nextLine();
        PeopleInfo[i] = personInfo;
      }
      //sort the array by ASCII
      Arrays.sort(PeopleInfo);
      //separate the name and birthday, store them in Name array and Birthday Array
      for (int i = 0; i < PeopleInfo.length; i++) {
        name = PeopleInfo[i].substring(0, PeopleInfo[i].indexOf(","));
        birthday = PeopleInfo[i].substring(name.length() + 1);
        Name[i] = name;
        Birthday[i] = birthday;
      }
      System.out.println(Arrays.toString(PeopleInfo));
      System.out.println(Arrays.toString(Name));
      System.out.println(Arrays.toString(Birthday));

    } catch (FileNotFoundException e) {
      System.out.println("Failed to read the text file");
      e.printStackTrace();
    }
  }


}
