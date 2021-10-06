package trees;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class AVLTreeGenerator extends JFrame implements ActionListener {
    static int [] array;
    static int N;

    static JFrame jFrame = new JFrame("Tree Generator");
    static JLabel jLabel = new JLabel();
    static JButton jButton = new JButton("Submit");
    static JTextField textField = new JTextField(5);
    AVLTreeGenerator(){
    }

    public static void main(String[] args) {
        //create a Frame to set the swing and title

        AVLTreeGenerator generator = new AVLTreeGenerator();
        jButton.addActionListener(generator);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(jButton);
        panel.add(jLabel);

        jFrame.add(panel);
        jFrame.setBounds(300,300,500,500);
        jFrame.setVisible(true);
    }


    public static void generateSortedArray(int number){
        Random random = new Random();
        array = new int[N];
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(100);
        }
        Arrays.sort(array);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Submit")) {
            N = Integer.parseInt(textField.getText());
            generateSortedArray(N);
            generateTreeFromSortedArray tree = new generateTreeFromSortedArray();
            Node node = tree.sortedArrayToBST(array, 0,array.length-1);
            BSTPrinter.printNode(node);
        }
    }

    public static class Node {
        int data;
        Node left, right;
        Stack<Integer> a = new Stack();

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public static class generateTreeFromSortedArray {
        //generate Balanced Binary Search Tree from a sorted array
        Node sortedArrayToBST(int arr[], int start, int end) {
            if (start > end) {
                return null;
            }
            int root = (start + end) / 2;//find the root of the tree
            Node node = new Node(arr[root]);
            node.left = sortedArrayToBST(arr, start, root - 1); //generate the left subtrees
            node.right = sortedArrayToBST(arr, root + 1, end); //generate
            return node;
        }
    }

    static class BSTPrinter {
        // method that print node
        public static String printNode(Node root) {
            int maxLevel = BSTPrinter.maxLevel(root);
            printNodeInternal(Collections.singletonList(root), 1, maxLevel);
            return null;
        }

        // method that print internal node
        private static void printNodeInternal(List<Node> nodes, int level, int maxLevel) {
            if (nodes.isEmpty() || BSTPrinter.isAllElementsNull(nodes))
                return;

            int floor = maxLevel - level;
            int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
            int firstSpaces = (int) Math.pow(2, (floor)) - 1;
            int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

            BSTPrinter.printSpaces(firstSpaces);
            List<Node> newNodes = new ArrayList<Node>();
            for (Node node : nodes) {
                if (node != null) {
                    System.out.print(node.data);
                    newNodes.add(node.left);
                    newNodes.add(node.right);
                } else {
                    newNodes.add(null);
                    newNodes.add(null);
                    System.out.print(" ");
                }
                BSTPrinter.printSpaces(betweenSpaces);
            }

            System.out.println("");
            for (int i = 1; i <= edgeLines; i++) {
                for (int j = 0; j < nodes.size(); j++) {
                    BSTPrinter.printSpaces(firstSpaces - i);
                    if (nodes.get(j) == null) {
                        BSTPrinter.printSpaces(edgeLines + edgeLines + i + 1);
                        continue;
                    }
                    if (nodes.get(j).left != null)
                        System.out.print("/");
                    else
                        BSTPrinter.printSpaces(1);
                    BSTPrinter.printSpaces(i + i - 1);
                    if (nodes.get(j).right != null)
                        System.out.print("\\");
                    else
                        BSTPrinter.printSpaces(1);
                    BSTPrinter.printSpaces(edgeLines + edgeLines - i);
                }
                System.out.println("");
            }
            printNodeInternal(newNodes, level + 1, maxLevel);
        }

        private static void printSpaces(int count) {
            for (int i = 0; i < count; i++)
                System.out.print(" ");
        }

        // method that ensure that node does exceed max
        private static int maxLevel(Node node) {
            if (node == null)
                return 0;
            return Math.max(BSTPrinter.maxLevel(node.left), BSTPrinter.maxLevel(node.right)) + 1;
        }

        /**
         *
         * @param list
         * @return
         */
        // method that check whether element is null or not
        private static boolean isAllElementsNull(List list) {
            for (Object object : list) {
                if (object != null)
                    return false;
            }
            return true;
        }
    }
}
