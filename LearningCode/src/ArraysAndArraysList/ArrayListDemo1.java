package ArraysAndArraysList;
import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //create an ArrayList to hold some names
        ArrayList<String> nameList = new ArrayList<String>();

        //Add some names to the ArrayList;
        nameList.add("Shunjie wan");
        nameList.add("Hanlin WAn");

        //Display the size of the ArrayList;
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it");

        //now display the items in name list
        for( int index = 0; index< nameList.size(); index++)
        {
            System.out.println(nameList.get(index));
        }
    }
}
