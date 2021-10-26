/**
 * BST part for CS 311 Assignment 2
 * Author: Shunjie Wan
 */
public class BST {

  public static node root;

  //constructor
  public BST() {
    root = null;
  }

  /**
   * @param value value to search
   * @return result
   */
  public node search(int value) {
    node currentNode = root;
    while (true) {
      if (currentNode == null || value == currentNode.value) {
        return currentNode;
      } else if (value < currentNode.value) {
        currentNode = currentNode.left;
      } else {
        currentNode = currentNode.right;
      }
    }
  }

  /**
   * insert section for BST
   *
   * @param value value to insert
   * @return inserted value
   */
  public node insert(int value) {
    node currentNode = root;
    node newNode = new node(value);
    if (currentNode == null) {
      root = newNode;
      return newNode;
    }
    while (true) {
      //end if current node equals the root node
      if (value == currentNode.value) {
        return null;
        //search the left node if the insert value less than the currentNode
      } else if (value < currentNode.value) {
        if (currentNode.left != null) {
          currentNode = currentNode.left;
          //if the node is null, insert new node
        } else {
          return currentNode.left = newNode;
        }
        //search the right node if the insert value greater than the currentNode
      } else {
        if (currentNode.right != null) {
          currentNode = currentNode.right;
          //if the node is null, insert new node
        } else {
          return currentNode.right = newNode;
        }
      }
    }
  }

  /**
   * Remove section for BST
   * @param value
   * @return
   */
//  public node remove (int value){
//
//  }
}

















