package Methods;
/**
 * THis program defines and calls a simple method.
 * @author wanshunjie
 *
 */
public class LoopCall {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello from the main method");
        for (int i = 0; i < 5; i ++)
        {
            displayMessage();
        }
        System.out.println("Back to the main method");
    }
    /**
     * The display Message method displays a greeting
     */
    public static void displayMessage (){

        System.out.println("Hello from the displayMessage method");
    }
}