package ArraysAndArraysList;

public class ArrayExample2 {
    public static void main(String[] args) {
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 3;
        myList[1] = 43;
        myList[2] = 33;
        myList[3] = 33 ;
        myList[4] = 2;
        myList[5] = 4;
        myList[6] = 32;
        myList[7] = 34 ;
        myList[8] = 23;
        myList[9] = 23;

        //calculate the summary of the array;
        double total = 0;
        for (int i =0; i < size; i ++)
        {
            total +=myList[i];
        }
        System.out.println("The summary is equals to:" + total );
    }
}

