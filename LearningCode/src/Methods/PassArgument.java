package Methods;
/**
 * THis program demonstrates a method with a parameter
 * @author wanshunjie
 *
 */
public class PassArgument {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("I am passing value to displayValue");
        displayValue(3);
        displayValue(x);
        displayValue(x*4);
        displayValue(Integer.parseInt("700"));
        System.out.println("That is all");
    }
    /**
     * This displayValue method displays the value of its integer parameter
     */

    public static void displayValue(int num){

        System.out.println("The value is "+ num);
    }

}
