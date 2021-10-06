package ArraysAndArraysList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /**
     * This program demonstrates how the enhanced for loop can be used with an ArrayList
     * @param args
     */
    public static void main(String[] args) {
        //create an ArrayList to hold some names;
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Shunjie wan");
        nameList.add("Hanlin Wan");

        //Display the size of the ArrayList;
        System.out.println("The ArrayList has " + nameList.size() + " objects stores in it");

        // now display the names which stores in the nameList;
        for (String name : nameList)
            System.out.println(name);
        System.out.println(nameList);
    }
}
