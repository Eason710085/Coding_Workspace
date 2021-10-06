package ArraysAndArraysList;

public class ArrayInitialization {
    public static void main(String[] args) {
        int[]day = {31,28,31,30,31,30,31,31,30,31,30,31};

        for( int index= 0; index<12; index++)
        {
            System.out.println("Month "+( index + 1) + " has " + day[index] + " days.");
        }
    }
}
