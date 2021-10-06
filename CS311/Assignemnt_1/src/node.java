/**
 * Code for CS 311 Assignment 1
 * node class
 * Author: Shunjie Wan
 */
public class node {
  public char data;
  public node leftChild;
  public node rightChild;

  //overloading constructors
  public node(char data) {
    this.data = data;
    this.leftChild = null;
    this.rightChild = null;
  }

  //getter for data
  public char getData() {
    return data;
  }

  //setter for data
  public void setData(char data) {
    this.data = data;
  }

  //getter for LeftChild
  public node getLeftChild() {
    return leftChild;
  }

  //setter for LeftChild
  public void setLeftChild(node leftChild) {
    this.leftChild = leftChild;
  }

  //getter for RightChild
  public node getRightChild() {
    return rightChild;
  }

  //setter for RightChild
  public void setRightChild(node rightChild) {
    this.rightChild = rightChild;
  }

  //equals method
  public boolean isEquals(node node1, node node2) {
    return node1.getData() == node2.getData() && node1.getLeftChild() == node2.getLeftChild() && node1.getRightChild() == node2.getRightChild();
  }

  //toString mehtod
  public String toString(node node) {
    return node.toString();
  }
}
