package ArraysAndArraysList;
import java.util.Scanner;
public class ArrayExample3 {
    public static void main(String[] args) {
        int x = 0;
        double sum = 0;
        int cnt = 0;
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x");
        x = input.nextInt();

        while( x != -1)
        {
            numbers[cnt] = x;
            sum = sum + x;
            cnt++;
            x= input.nextInt();
        }
        if (cnt > 0)
        {
            double average = sum/cnt;
            for ( int i = 0; i < cnt; i++)
            {
                if (numbers[1]>average)
                {
                    System.out.println(numbers[1]);
                }
                input.close();}

        }
    }
}
