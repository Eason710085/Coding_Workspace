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
    Option();
  }

  public static void Option() {
    System.out.println("Enter Y to run, N to quit");
    Scanner scanner = new Scanner(System.in);
    String option;
    option = scanner.nextLine();
    if (option.equals("Y")) {
      int optNum;
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
