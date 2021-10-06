package Methods;
/**
 * THis program demonstrates that only a copy of an argument is passed into a method
 * @author wanshunjie
 *
 */
public class PassByValue {

    public static void main(String[] args) {

        int number = 99; //number starts with 99

        //display the value in number
        System.out.println("Number is " + number);

        //call Me. passing the value in number as an argument
        changeMe(number);

        //display the value in number again
        System.out.println("number is " + number);
    }

    /**
     * The changeMe method accepts an argument and then changes the value of the parameter
     */
    public static void changeMe (int myValue){
        System.out.println("I am changing the value");

        //change the myValue parameter variable to 0
        myValue = 0;
        //display the value in my value
        System.out.println("Now the value is "+ myValue);

    }

}
