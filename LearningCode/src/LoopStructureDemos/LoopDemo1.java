package LoopStructureDemos;

public class LoopDemo1 {

    public static void main(String[] args) {
        //create loops to print a list of number;
        int count = 0;

        //print number form 0 to n, such us 0 to 4;
        while (count< 9)
        {
            System.out.println(count);
            count++;
        }

        System.out.println("the final result is:" + count);
    }
}