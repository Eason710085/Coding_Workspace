package project5;
/**
 * Represents an triangle exception.
 */
@SuppressWarnings("serial")
public class InvalidTriangleException extends Exception {
	/**
	 * Constructs a new InvalidTriangleException.
	 * 
	 * @param message the error message
	 */
	public InvalidTriangleException(String message) {
		super(message);
	}
}
