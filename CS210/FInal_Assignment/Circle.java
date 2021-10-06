package project5;
/**
 * a sub class of shape
 * @author Shunjie Wan
 *
 */

public class Circle extends Shape {
	// The radius of this circle. 
	private double radius;

	/**
	 * Creates a default circle instance.
	 * By default,a circle has the following values for its fields: 
	 * name: “Circle”
	 * radius: 1.0
	 */
	public Circle() {
		super("Circle");
		radius = 1;
	}

	/**
	 * Creates a circle instance with a specific name and a specific radius.
	 * 
	 * @param name   the name of this circle.
	 * @param radius the radius of this circle.
	 */
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	/**
	 * Retrieves the radius of this circle.
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Changes the radius of this circle.
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Returns the area of this circle.
	 * @return the area
	 */
	public double area() {
		return radius * radius * Math.PI;
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
		// The specific object isn't a circle.
		if (!(obj instanceof Circle)) {
			return false;
		}

		// The specific object is a circle.
		Circle other = (Circle) obj;
		return super.equals(other) && radius == other.radius;
	}

	/**
	 * get the string representation of this object.
	 * 
	 * @return the string representation of this object.
	 */
	public String toString() {
		return super.toString() + "(Radius: " + radius + ")";
	}
}

