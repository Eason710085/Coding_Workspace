/**
 * BST part for CS 311 Assignment 2
 * Author: Shunjie Wan
 */
public class BST {
  //root
  public static Node<String> root;

  //constructor
  public BST() {
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
    //compare the two info's size
    //if compare = 0, same size
    //if compare <0, person < node.person
    //if compare > 0, person > node.person
    int compare = person.compareTo(node.person);
    if (compare < 0) {
      node.left = insertRec(person, node.left);
    } else if (compare > 0) {
      node.right = insertRec(person, node.right);
    }
    return node;
  }

  /**
   * Method that print the tree in inorder traversal
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

  /**
   * Search method for the BST
   * @param personInfo person user want to search
   * @return tree/false
   */
  public static boolean search(String personInfo){
    root = searchRec(personInfo, root);
    return root != null;
  }
  public static Node<String> searchRec(String person, Node<String> node){
    if (root == null && null == person){
      return null;
    }
    assert root != null;
    if (root.person.compareTo(person) > 0 ){
      return searchRec(person,root.left);
    }else {
      return searchRec(person, root.right);
    }
  }
}

















