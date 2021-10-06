package ArraysAndArraysList;

public class ArrayExample1 {
    public static void main(String[] args) {
//        for (int score : scores) {
//			System.out.println(score);
//		}

    //Basic Array
    final int Limit = 15, Multiple = 10;

    //Limit indicates the length of this array
    int[] list = new int[Limit];

    //initialize the array value
    //An array is not fixed-sized data structure;
    // The length of an array should be positive integer than can
    //.be stored as constant
    for (int index = 0; index < Limit; index++) {
        //multiply index by ten
        list[index] = index * Multiple;
    }
    //change one array value
    list[5] = 999;

    //print the array value using iterator version of for loop
    for (int value : list) {
        System.out.println(value + "");
    }
    System.out.println();
    //Another way to print the array values
    //To retrieve the length of an array, using instance variable length of array class.
    // for example, list. length
    for (int index = 0; index < list.length; index++) {
        System.out.println(list[index] + "");
    }
}
}

