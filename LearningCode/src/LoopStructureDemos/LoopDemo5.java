package LoopStructureDemos;
public class LoopDemo5 {

    public static void main(String[] args) {
        //create loop to print a list of number

        double count = 0;
        int outerCount = 0;

        while (outerCount < 6)
        {
            System.out.println("THe inner while is to start: ");
            while (count < 5)
            {
                System.out.println(count);
                count++;

            }
            count = 0;
            outerCount++;
        }

        System.out.println("final count value is: " + count);
    }

}