/**
 * BST part for CS 311 Assignment 2
 * Author: Shunjie Wan
 */
public class BST {
  //root
  public static Node<String> root;

  public  BST() {
    root = null;
  }

  /**
   * Insert method for the BST
   *
   * @param person person to add
   */
  public static void insert(String person) {
    root = insertRec(person, root);
  }

  private static Node<String> insertRec(String person, Node<String> node) {
    if (node == null) {
      return new Node<>(person);
    }
    int compare = person.compareTo(node.person);
    if (compare < 0) {
      node.left = insertRec(person, node.left);
    } else if (compare > 0) {
      node.right = insertRec(person, node.right);
    }
    return node;
  }

  /**
   * print all the person info in the database
   */
  public static void printData() {
    dataTraversal(root);
  }
  public static void dataTraversal(Node<String> node) {
    if (node == null) {
      return;
    } else {
      dataTraversal(node.left);
      System.out.println(node.person + " ");
      dataTraversal(node.right);
    }
  }

  public static void delete(String person){

  }
//  public static Node<String> deleteRec(String person, Node<String> node){
//
//  }
}

















