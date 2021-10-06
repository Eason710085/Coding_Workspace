package project5;

/**
 * a sub class of Shape,
 * @author Shunjie Wan
 */
public class Triangle extends Shape {
	/** The sideOne of this triangle. */
	private double sideOne;
	/** The sideTwo of this triangle. */
	private double sideTwo;
	/** The sideThree of this triangle. */
	private double sideThree;

	/**
	 * Creates a default triangle instance.
	 */
	public Triangle() {
		super("Triangle");
		sideOne = 1;
		sideTwo = 1;
		sideThree = 1;
	}

	/**
	 * Creates a triangle instance with a specific name, specific sideOne, specific
	 * sideTwo, and a specific sideThree.
	 * 
	 * @param name      the name of this triangle.
	 * @param sideOne   the sideOne of this triangle.
	 * @param sideTwo   the sideTwo of this triangle.
	 * @param sideThree the sideThree of this triangle.
	 */
	public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
		try {
			if (sideOne + sideTwo > sideThree && Math.abs(sideOne - sideTwo) < sideThree) {
				setName(name);
				this.sideOne = sideOne;
				this.sideTwo = sideTwo;
				this.sideThree = sideThree;
			} else {
				throw new InvalidTriangleException("invalid triangle");
			}
		} catch (InvalidTriangleException e) {
			// Handle InvalidTriangelException.
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			// handle other exceptions.
			e.printStackTrace();
		} finally {

		}
	}

	/**
	 * Retrieves the sideOne of this triangle.
	 * 
	 * @return the sideOne
	 */
	public double getSideOne() {
		return sideOne;
	}

	/**
	 * Changes the sideOne of this triangle.
	 * 
	 * @param sideOne the sideOne to set
	 */
	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	/**
	 * Retrieves the sideTwo of this triangle.
	 * 
	 * @return the sideTwo
	 */
	public double getSideTwo() {
		return sideTwo;
	}

	/**
	 * Changes the sideTwo of this triangle.
	 * 
	 * @param sideTwo the sideTwo to set
	 */
	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	/**
	 * Retrieves the sideThree of this triangle.
	 * 
	 * @return the sideThree
	 */
	public double getSideThree() {
		return sideThree;
	}

	/**
	 * Changes the sideThree of this triangle.
	 * 
	 * @param sideThree the sideThree to set
	 */
	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	/**
	 * Returns the area of this triangle.
	 * 
	 * @return the area
	 */
	public double area() {
		double p = (sideOne + sideTwo + sideThree) / 2;
		return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
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
		// The specific object isn't a triangle.
		if (!(obj instanceof Triangle)) {
			return false;
		}

		// The specific object is a triangle.
		Triangle other = (Triangle) obj;
		return super.equals(other) && sideOne == other.sideOne && sideTwo == other.sideTwo
				&& sideThree == other.sideThree;
	}

	/**
	 * get the string representation of this object.
	 * 
	 * @return the string representation of this object.
	 */
	public String toString() {
		return super.toString() + "(" + sideOne + ", " + sideTwo + ", " + sideThree + ")";
	}
}


