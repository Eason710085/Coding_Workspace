import java.util.Stack;

/**
 * Code for CS 311 Assignment 1
 * Expression tree
 * Author: Shunjie Wan
 */
public class expressionTree {
  //Overriding Constructor
  public expressionTree() {
  }

  //create a tree node
  public node tree;
  //store the infix expression
  public String infixExpression;
  //store the postfix expression
  public String postfixExpression;

  /**
   * method that check operators
   *
   * @param c pass the operator into the method to check
   * @return true
   */
  public boolean isOperator(char c) {
    return c == '+' || c == '-'
      || c == '*' || c == '/'
      || c == '^';
  }

  /**
   * method that check priority
   *
   * @param c pass the operator into this method that check the priority
   * @return 1, 2, 3
   */
  public static int priority(char c) {
    if (c == '+' || c == '-') {
      return 1;
    } else if (c == '*' || c == '/') {
      return 2;
    } else if (c == '^') {
      return 3;
    }
    return -1;
  }

  /**
   * transfer infix expression to postfix expression
   *
   * @param infix read infix expression from file
   */
  public void infixToPostfix(String infix) {
    infixExpression = infix;
    StringBuilder postfix = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < infix.length(); ++i) {
      char c = infix.charAt(i);
      //check if the char is operand
      if (Character.isLetterOrDigit(c))
        postfix.append(c);
        //check whether the char is '('
      else if (c == '(')
        stack.push(c);
        //if the char is ')' pop out
      else if (c == ')') {
        while (!stack.isEmpty() && stack.peek() != '(')
          postfix.append(stack.pop());
        stack.pop();
      } else {
        while (!stack.isEmpty() && priority(c) <= priority(stack.peek())) {
          postfix.append(stack.pop());
        }
        stack.push(c);
      }
    }
    // pop out all the char from the stack
    while (!stack.isEmpty()) {
      if (stack.peek() == '(')
        return;
      postfix.append(stack.pop());
    }
    postfixExpression = postfix.toString();
    //pass the postfix expression to the treeGenerator method
    treeGenerator(postfixExpression);
  }


  /**
   * treeGenerator method
   *
   * @param postfix pass the postfix to the treeGenerator
   */
  public void treeGenerator(String postfix) {
    Stack<node> stack = new Stack<>();
    node node1, node2;

    for (int i = 0; i < postfix.length(); i++) {
      // If operand, simply push into stack
      if (!isOperator(postfix.charAt(i))) {
        tree = new node(postfix.charAt(i));
        stack.push(tree);
      } else {
        tree = new node(postfix.charAt(i));
        // Pop two top nodes
        //remove the top
        node1 = stack.pop();
        node2 = stack.pop();

        //  make them be the leftChild and rightChild
        tree.setRightChild(node1);
        tree.setLeftChild(node2);
        stack.push(tree);
      }
    }
    tree = stack.peek();
    stack.pop();
  }

  /**
   * Preorder Traversal Method
   * using recursion
   * visit the root node
   * preorder traversal the left child tree
   * preorder traversal the right child tree
   *
   * @param node pass the tree to the preOrderTraversal method
   */
  public String preOrderTraversal(node node) {
    StringBuilder buffer = new StringBuilder();
    if (node != null) {
      buffer.append(node.getData()).append(" ");
      buffer.append(preOrderTraversal(node.getLeftChild()));
      buffer.append(preOrderTraversal(node.getRightChild()));
    }
    return buffer.toString();
  }

  /**
   * Inorder Traversal Method
   * using recursion
   * inorder traversal the left child tree
   * visit the root node
   * inorder traversal the right child tree
   *
   * @param node pass the tree to inOrderTraversal method
   */
  public String inOrderTraversal(node node) {
    StringBuilder buffer = new StringBuilder();
    if (node != null) {
      buffer.append(inOrderTraversal(node.getLeftChild()));
      buffer.append(node.getData()).append(" ");
      buffer.append(inOrderTraversal(node.getRightChild()));
    }
    return buffer.toString();
  }

  /**
   * Postorder Traversal Method
   * postorder traversal the left child tree
   * postorder traversal the right child tree
   * visit the root node
   *
   * @param node pass the tree to postOrderTraversal method
   */
  public String postOrderTraversal(node node) {
    StringBuilder buffer = new StringBuilder();
    if (node != null) {
      buffer.append(postOrderTraversal(node.getLeftChild()));
      buffer.append(postOrderTraversal(node.getRightChild()));
      buffer.append(node.getData()).append(" ");
    }
    return buffer.toString();
  }

  public boolean isEquals (node node1, node node2){
    return node1.getData() == node2.getData() && node1.getLeftChild() 
      == node2.getLeftChild() && node1.getRightChild() == node2.getRightChild();
  }
  /**
   * expressionTree toString method
   * A string representation of this expression tree
   *
   * @return the type of this tree
   * the infix expression of this tree
   * the prefix form of this tree
   * the prefix form of this tree
   * the postfix form of this tree
   */
  public String toString() {
    //use line to split each section
    StringBuilder spiltLine = new StringBuilder();
    for (int i = 0; i < 55; i++) {
      spiltLine.append("-");
    }
    spiltLine.append("\n");

    return initialPrinter() +
      preOrderTraversalPrinter() +
      inOrderTraversalPrinter() +
      postOrderTraversalPrinter() + spiltLine;
  }

  /**
   * initialPrinter ---> helper method
   * which will print the type of the tree, and the infix expression
   *
   * @return the type of the tree, and the infix expression
   * initialPrinter, preOrderTraversalPrinter,
   * inOrderTraversalPrinter,postOrderTraversalPrinter
   * will combined in the toString method, as the totally output of the result
   */
  public String initialPrinter() {
    return "Tree type: " + infixExpression.getClass().getSimpleName() + "\n" +
      "Infix Expression: " + infixExpression + "\n";
  }

  /**
   * preOrderTraversalPrinter ---> helper method
   * print the preOrderTraversal
   *
   * @return prefix
   */
  public String preOrderTraversalPrinter() {
    return "Preorder Traversal: " + "\n" +
      preOrderTraversal(tree) + "\n";
  }

  /**
   * inOrderTraversal ---> helper method
   * print the inOrderTraversal
   *
   * @return infix
   */
  public String inOrderTraversalPrinter() {
    return "Inorder Traversal: " + "\n" +
      inOrderTraversal(tree) + "\n";
  }

  /**
   * postOrderTraversalPrinter ---> helper method
   * print the postOrderTraversal
   *
   * @return postfix
   */
  public String postOrderTraversalPrinter() {
    return "Postorder Traversal: " + "\n" +
      postOrderTraversal(tree) + "\n";
  }
}
