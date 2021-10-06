package project5;

/**
 * Represents a basic shape.
 * @author Shunjie Wan
 */
public abstract class Shape {
	// The name of this shape. 
	private String name;

	/**
	 * Creates a Shape instance with a default name referred as this Shape object.
	 */
	public Shape() {
		name = "";
	}

	/**
	 * Creates a Shape instance with a specific name referred as this Shape object.
	 * 
	 * @param name the name of shape
	 */
	public Shape(String name) {
		this.name = name;
	}

	/**
	 * Retrieves the name of this shape.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes the name of this shape.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Indicate if this object "equal to" another object.
	 * 
	 * @param obj A reference to some other object
	 * 
	 * @return A boolean value specifying if this object is equal to some other
	 *         object
	 */
	public boolean equals(Object obj) {
		// If the specific object isn't a shape.
		if (!(obj instanceof Shape)) {
			return false;
		}

		//If the specific object is a shape.
		Shape other = (Shape) obj;
		return this.name.equals(other.name);
	}

	/**
	 * get the string representation of this object.
	 * 
	 * @return the string representation of this object.
	 */
	public String toString() {
		return name;
	}

	/**
	 * Returns the area of this shape.
	 * 
	 * @return the area
	 */
	public abstract double area();
}

