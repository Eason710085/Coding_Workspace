package Exception;
/**
 * Returns the factorial of the argument given.
 */
public class ExceptionThrown {
    /**
     * Demonstrates throwing exceptions.
     * @param args A string array that can hold command-line parameters
     */
    public static void main(String[] args) {
        int a = factorial(-3);
        System.out.println(a);
    }

    /**
     * Returns the factorial of the argument given.
     *
     * @param n The given argument
     */
    public static int factorial(int n){
        int fac = 1;
        if (n < 0)
            throw (new IllegalArgumentException("Factorial is undefined " +
                    "for negative integers"));
        else if (n > 16)
            throw (new IllegalArgumentException("Factorial(" + n + ") is too "
                    + "large - overflow occurs!"));


        for (int i=n; i>0; i--){
            fac *= i;
        }

        return fac;
    }
}

