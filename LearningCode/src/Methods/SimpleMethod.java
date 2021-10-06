package Methods;
/**
 * demonstration of invocation of a simple method
 * @param args
 */
public class SimpleMethod {
    /**
     * defines and calls a simple method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello from the main method");
        displayMessage();
        System.out.println("Back in the main method");
    }
    /**
     * Display a greeting
     *
     */
    public static void displayMessage() {

        System.out.println("Hello from the displayMessage method.");
    }
}