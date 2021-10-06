package ArraysAndArraysList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    /**
     * this program demonstrates an arrayList
     * @param args
     */
    public static void main(String[] args) {
        //create an arrayList to hold some names;
        ArrayList<String> nameList = new ArrayList<String>();

        //Add some names to the arrayList
        nameList.add("JAmes");
        nameList.add("Bill");
        nameList.add("ShunjieWan");

        //display the items in nameList and their indices;
        for (int index= 0; index<nameList.size();index++)
        {
            System.out.println("Index: " + index+ " name: "+ nameList.get(index));
        }

        //now display the items at index1
        nameList.remove(1);

        System.out.println("the item at index 1 is removed. "+ " here are the item now.");

        //display the items in nameList and their indices
        for (int index=0; index<nameList.size(); index++)
        {
            System.out.println("index: "+ index + " Name: "+ nameList.get(index));
        }
    }
}
