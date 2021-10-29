/**
 * node part for CS 311 Assignment 2
 * Author Shunjie Wan
 */
public class Node<T>{
  T person;
  Node<T> left, right;

  /**
   * constructor
   * @param person pass name
   */
  public Node(T person) {
    this.person = person;
    left = null;
    right = null;
  }
}
