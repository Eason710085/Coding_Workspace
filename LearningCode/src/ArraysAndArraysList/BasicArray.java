package ArraysAndArraysList;

public class BasicArray {
    /**
     * Create  an array  fills it with various integer values
     * modifies one value then prints them out
     * @param args  A reference to a string array containing command-line arguments
     */
    public static void main(String[] args) {
        final int LIMIT  = 15,  MULTIPLE  =  10;

        //limit indicates the length of this  array
        int [] list = new int [LIMIT];

        //initialize the array values
        //an array is not   fixed-sized data structure
        //the length of an array should be a positive integer that can be stored as a constant
        for  (int  index=0;  index<LIMIT; index++)
        {
            list[index]= index*MULTIPLE;
        }
        //change one array value
        list[5]=99;

        //print the array values  using iterator version of for  loop
        for(int  value : list)
        {
            System.out.println(value+ "");
        }

        System.out.println();
        //another way to print the array values
        // to  retrieve   the length  of an  array, use instance variable length of array class
        for(int index= 0; index<list.length; index++)
        {
            System.out.println(list[index] + "");
        }
        System.out.println();
    }

}
