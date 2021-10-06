package LoopStructureDemos;

public class LoopDemo2 {

    public static void main(String[] args) {
        int count = 0, sum = 0;

        //add number from 0 to 4;
        while (count< 5)
        {
            System.out.println(count);
            sum += count;
            System.out.println("SUM: " + sum + "\tCOUNT: " + count);
            count++;
        }
        System.out.println("After the while, ");
        System.out.println("SUM: " + sum + "\tCOUNT: " + count);

    }

}
