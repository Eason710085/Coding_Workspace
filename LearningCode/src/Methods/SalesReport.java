package Methods;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * this program opens a file containing the sales amounts for 30 days,
 * it calculates and displays the total sales and average daily sales
 * @author wanshunjie
 *
 */
public class SalesReport {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        final int NUM_DAYS = 30; //Number of days of sales
        String filename; //the name of the file to open
        double totalSales; //Total sales for period
        double averageSales; //average daily sales

        //get the name of the file
        filename = getFileName();

        //get the total sales from the file
        totalSales = getTotalSales(filename);

        //calculate the average
        averageSales = totalSales / NUM_DAYS;
        System.exit(0);
    }

    /**
     * the get fileName method prompts the users to enter the name of the file to open
     *
     * @return A reference to a string object containing the name of the file
     */
    public static String getFileName() {
        String file; //to hold the file name

        //prompt the users to enter a file name
        file = JOptionPane.showInputDialog("Enter the name of the file\n" + "containing 30 daysof the sales amounts>");

        //return the name
        return file;
    }

    /**
     * The getTotalSales method opens file and reads the daily amounts, accumulating the total
     * the total is returned
     *
     * @param filename the name of the file to open
     * @param the      total of the sales amounts
     */
    public static double getTotalSales(String filename) throws IOException {
        double total = 0.0; //Accumulator
        double sales; //a daily sales amount

        //open the file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(filename);

        //this loop processes the lines to read from the file
        //until the end of the file is encountered
        while (inputFile.hasNext()) {
            //read a double from the file
            sales = inputFile.nextDouble();
            //add sales to the values already in total
            total += sales;
        }
        //close the file
        inputFile.close();

        //return the total sales
        return total;
    }

    /**
     * the displayResults method displays the totals average daily sales
     *
     * @param total the total sales
     * @param avg   the average daily sales
     */
    public static void displayResults(double total, double avg) {
        //display the formatted total and average sales
        JOptionPane.showMessageDialog(null, String.format("The total sales for the period is $%, .2f\n"
                + "The aaverage daily sales were $%, .2f", total, avg));
    }
}
