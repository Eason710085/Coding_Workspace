package LoopStructureDemos;

public class LoopDemo6 {

    public static void main(String[] args) {
        // print a list of number with loop

        int count = 0;

        while (count < 5)
        {
            System.out.println(count);
            count++;
        }
        for ( count =0 ; count <5 ; count++)
        {
            System.out.println(count);
        }
        System.out.println("final result is " + count);
    }

}
