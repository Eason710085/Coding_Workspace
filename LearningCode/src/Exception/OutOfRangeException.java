package Exception;

public class OutOfRangeException extends Exception {
    /**
     * Sets up the exception object with a particular message.
     * @param message A string literal specifying the exception
     */
    public OutOfRangeException (String message){
        super(message);
    }

    public static void main(String[] args){
        OutOfRangeException ex = new OutOfRangeException("My message");
        ex.printStackTrace();
    }
}