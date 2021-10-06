package project5;

/**
 * A sub class of Shape. Represents a rectangle shape.
 * @author Shunjie Wan
 */
public class Rectangle extends Shape {
	//The length of this rectangle. 
	private double length;
	// The width of this rectangle.
	private double width;

	/**
	 * Creates a default rectangle instance.
	 *  By default, a rectangle has the following values for its fields:
	 */
	public Rectangle() {
		super("Rectangle");
		length = 1;
		width = 1;
	}

	/**
	 * Creates a rectangle instance with a specific name, specific length, and a
	 * specific width.
	 * @param name   the name of this rectangle.
	 * @param length the length of this rectangle.
	 * @param width  the width of this rectangle.
	 */
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	/**
	 * Retrieves the length of this rectangle.
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Changes the length of this rectangle.
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Retrieves the width of this rectangle.
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Changes the width of this rectangle.
	 * 
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Returns the area of this rectangle.
	 * @return the area
	 */
	public double area() {
		return length * width;
	}

	/**
	 * Indicate if this object "equal to" another object.
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this object is equal to some other object
	 */
	public boolean equals(Object obj) {
		// If the specific object isn't a rectangle.
		if (!(obj instanceof Rectangle)) {
			return false;
		}

		//If the specific object is a rectangle.
		Rectangle other = (Rectangle) obj;
		return super.equals(other) && length == other.length && width == other.width;
	}

	/**
	 * get the string representation of this object.
	 * 
	 * @return the string representation of this object.
	 */
	public String toString() {
		return super.toString() + "(" + length + " * " + width + ")";
	}
}



