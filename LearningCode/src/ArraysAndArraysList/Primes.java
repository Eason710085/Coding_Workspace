package ArraysAndArraysList;

public class Primes {
    /**
     * Stores some prime  numbers in an array and prints them
     *
     * @param args
     */
    public static void main(String[] args) {
        //length is equals to the number of element in  an array
        int[] primeNums = {2,3,5,7,11,13,17,19};

        //display the length
        System.out.println("Array length: "  + primeNums.length);

        //display the elements in order
        System.out.println("The  first few prime number are: ");
        for(int prime  :  primeNums)
        {
            System.out.println(prime + "");
        }
    }
}