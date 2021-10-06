import java.io.*;
import java.util.Scanner;
/**
 * Assignment 1 for CS 311
 * Author: Shunjie Wan
 * The driver program
 * 1. Read the fully parenthesized infix expressions from Expressions.txt file
 * 2. Visit the tree in a preorder traversal
 * 3. Visit the tree in an inorder traversal
 * 4. Visit the tree in a postorder traversal
 */
public class driver {
  public static void main(String[] args) {
    expressionTree expressionTree = new expressionTree();
    try {
      //import the Expressions.txt file
      //The file must in the src folder
      File file = new File("src/Expressions.txt");
      //read the file
      Scanner reader = new Scanner(file);
      //count the number of the infix expression
      int count = 1;
      //if the expression still available, then keep reading from file
      while (reader.hasNextLine()) {
        System.out.println("NO." + count);
        String infixExpression = reader.nextLine();
        //pass the infix expression to the infixToPostfix method
        //transfer to postfix expression, then generate the expression tree
        expressionTree.infixToPostfix(infixExpression);
        //use the toString method
        //print out the tree in preorder, inorder and postorder traversal
        System.out.println(expressionTree.toString());
        count++;
      }
      //close the file when finish reading
      reader.close();
      //catch the file no found exception
    } catch (FileNotFoundException e) {
      System.out.println("Failed to read the text file");
      e.printStackTrace();
    }
  }
}
