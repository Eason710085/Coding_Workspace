package LoopStructureDemos;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileInputDemo {
    /*Demonstration of running sums.
     *
     */
    public static void main(String[] args) throws FileNotFoundException  {
        int a, sum = 0;
        File dataSource = new File("Friends/dataSource/data");
        Scanner input = new Scanner(dataSource);
        final int END_OF_INPUT = -1;

        //input validation;
        while (input.hasNext())
        {
            a = input.nextInt();
            if (a != END_OF_INPUT)
            {
                sum = sum + a;
            }
            System.out.println("a: " + a + "sum: " + sum);
        }
        input.close();


    }

}
