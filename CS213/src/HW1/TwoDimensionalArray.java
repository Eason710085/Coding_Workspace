package HW1;

import java.util.Random;

/**
 * Name: Shunjie Wan
 * Class: CS 213
 * 2D Array Operations
 * Write a program that creates a two-dimensional array initialized with test data.
 *
 */

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //create a random two-dimensional array with all integers. The row and the column are 5
        int [][] array = new int [5][5];
        //creat a array with random numbers
        Random r = new Random();
        System.out.println("Here is the two-dimensional array with rows and columns are 5:");
        for(int i=0; i< array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = r.nextInt(99); //limit the range of this array
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The total of all elements is "+getTotal(array));
        System.out.println("The average of all elements is "+getAverage(array));
        System.out.println("The total of all elements in row 3 is "+getRowTotal(array,3));//I use row 3 as the specified row
        System.out.println("The total of all elements in column 3 is "+getColumnTotal(array,3));//I use row 3 as the specified row
        System.out.println("The highest element in row 3 is "+getHighestInRow(array,3));
        System.out.println("The lowest element in column 3 is "+getLowestInRow(array,3));

        getTotal(array);

    }

    /**
     * get the total value of the random array
     * @param getArray get the random array
     * @return total
     */
    public static int getTotal (int [][] getArray){
        int total =0; //Accumulator, set to 0
        // Sum the array elements.
        for (int[] ints : getArray) {
            for (int anInt : ints) total += anInt;
        }
        return total;
    }

    /**
     * get the average value of the random array
     * @param getArray get the random array
     * @return average
     */
    public static double getAverage (int[][] getArray ){
        double average;
        //get the average value of this random array
        average = (double)getTotal(getArray)/25;
        return average;
    }

    /**
     * get the specified row total value
     * @param getArray get the random array
     * @param row the subscript of a row in the array
     * @return total
     */
    public static int getRowTotal(int [][] getArray,int row){
        int rowTotal = 0;
        //get the total value of a specified row
        for (int col = 0; col < getArray[row].length; col++) {
            rowTotal += getArray[row][col];
        }
        return rowTotal;
    }

    /**
     * get the specified column total value
     * @param getArray get the random array
     * @param col the subscript of a column in the array.
     * @return colTotal
     */
    public static int getColumnTotal(int [][] getArray, int col){
        int colTotal = 0;
        //get the total value of a specified column
        for (int[] ints : getArray) {
            colTotal += ints[col];
        }
        return colTotal;
    }

    /**
     * get the highest value from a specified row
     * @param getArray  get the random array
     * @param row the subscript of a row in the array.
     * @return highestRow
     */
    public static int getHighestInRow(int [][] getArray,int row){
        int highestRow = getArray[row][0];
        //get the highest value of the specified row
        for (int col = 1; col < getArray[row].length; col++) {
            if (getArray[row][col] > highestRow) {
                highestRow = getArray[row][col];
            }
        }
        return highestRow;
    }

    /**
     * get the lowest value from a specified row
     * @param getArray get the random array
     * @param row the subscript of a row in the array.
     * @return lowestRow
     */
    public static int getLowestInRow(int [][] getArray, int row){
        int lowestRow = getArray[row][0];
        //get the lowest value of the specified row
        for (int col = 1; col < getArray[row].length; col++) {
            if (getArray[row][col] < lowestRow) {
                lowestRow = getArray[row][col];
            }
        }
        return lowestRow;
    }
}
