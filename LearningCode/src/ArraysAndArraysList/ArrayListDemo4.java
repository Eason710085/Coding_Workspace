package ArraysAndArraysList;
import java.util.ArrayList;

public class ArrayListDemo4 {
    /**
     * this program demonstrates inserting an item;
     * @param args
     */
    public static void main(String[] args) {
        //create an arrayList to hold some names;
        ArrayList <String> nameList = new ArrayList<String>();

        //and some names to arrayList
        nameList.add("Eason");
        nameList.add("Shunjie wan");
        nameList.add("John");

        //display the items in nameList and their indices
        for (int index=0; index<nameList.size(); index++)
        {
            System.out.println("index:" + index +" Name:"+ nameList.get(index));
        }
        //now insert an item at index 1
        nameList.add(1, "Smiths");

        System.out.println("Smiths was add at index1. " +
                "here are the items now");

        // display the items in nameList and their indices;
        for (int index =0; index< nameList.size(); index++)
        {
            System.out.println("index: " + index + " Name: " + nameList.get(index));
        }

        // if we want to replace one item
        // we can use nameList.set()

        nameList.set(1, "卧槽");
        System.out.println("Shunjie Wan was replaced by 卧槽");
        //display the nameList after replacing
        for(int index=0; index<nameList.size(); index++)
        {
            System.out.println("Index: " + index +" Name:" + nameList.get(index));
        }
    }
}
