package Exception;

/**
 * Create a exception scope object and invokes the level1 method
 * @author wanshunjie
 *
 */
public class ExceptionProgagation {
    /**
     * Invokes the level1 method to begin the exception demonstration.
     * @param args A string array that can hold command-line parameters
     */
    public static void main(String[] args) {
        ExceptionScope demo = new ExceptionScope();

        System.out.println("Program beginning.");
        demo.level1();
        System.out.println("Program ending.");
    }
}

/**
 * Demonstrates the exception scope.
 */
class ExceptionScope {
    /**
     * Catches and handles the exception that is thrown in level3.
     */
    public void level1(){
        System.out.println("Level 1 beginning.");

        try{
            level2();
        }catch (ArithmeticException problem){
            System.out.println ();
            System.out.println ("The exception message is: " + problem.getMessage());
            System.out.println ();
            System.out.println ("The call stack trace:");
            problem.printStackTrace();
            System.out.println ();
        }

        System.out.println("Level 1 ending.");
    }

    /**
     * Serves as an intermediate level.  The exception propagates through
     * this method back to level1.
     */
    public void level2(){
        System.out.println("Level 2 beginning.");
        level3 ();
        System.out.println("Level 2 ending.");
    }

    /**
     *  Performs a calculation to produce an exception.  It is not
     *  caught and handled at this level.
     */
    public void level3() {
        int numerator = 10, denominator = 0;
        int result;
        System.out.println("Level 3 beginning.");
        //Division by 0 exception may occur here.
        result = numerator / denominator;
        System.out.println("Level 3 ending.");
    }
}
