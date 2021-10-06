package project5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A helper class for testing all the shapes.
 * @author Shunjie Wan
 */
public class ShapeHelper {
	/**
	 * Calls method create that creates/returns a list of shapes. It also calls
	 * method display that displays the list of shapes in order.
	 * @throws FileNotFoundException
	 */
	public static void start() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String fileName;
		ArrayList<Shape> shapes;
		System.out.println("Two Choice: shapes1.txt or shapes2.txt");
		System.out.println("shapes1.txt is correct format.\nshapes2.txt is to show Exception");
		System.out.println("Enter a file name: ");
		fileName = input.next();
		shapes = create(fileName); // calls create that returns a list of shapes.
		display(shapes); // calls display to print the list of shapes in order.
		input.close();
	}

	/**
	 * Displays each shape along with the area of each shape.
	 * @param shapes the shapes.
	 */
	public static void display(ArrayList<Shape> shapes) {
		for (Shape shape : shapes) {
			System.out.println(shape);
			System.out.println("area: " + String.format("%.2f", shape.area()));
		}
	}

	/**
	 * Creates a list of shapes by the file content.
	 * 
	 * @param fileName the name of data file
	 * @return a list of shapes
	 * @throws FileNotFoundException
	 */
	public static ArrayList<Shape> create(String fileName) throws FileNotFoundException {
		ArrayList<Shape> list = new ArrayList<>();

		Scanner scanner = new Scanner(new File(fileName));
		while (scanner.hasNextLine()) {
			String type = scanner.nextLine();
			if (type.equals("Rectangle")) {
				String name = scanner.nextLine().trim();
				double length = Double.parseDouble(scanner.nextLine());
				double width = Double.parseDouble(scanner.nextLine());
				Rectangle rectangle = new Rectangle(name, length, width);
				list.add(rectangle);
			} else if (type.equals("Triangle")) {
				String name = scanner.nextLine();
				double sideOne = Double.parseDouble(scanner.nextLine());
				double sideTwo = Double.parseDouble(scanner.nextLine());
				double sideThree = Double.parseDouble(scanner.nextLine());
				Triangle triangle = new Triangle(name, sideOne, sideTwo, sideThree);
				list.add(triangle);
			} else if (type.equals("Circle")) {
				String name = scanner.nextLine().trim();
				double radius = Double.parseDouble(scanner.nextLine());
				Circle circle = new Circle(name, radius);
				list.add(circle);
			}
		}
		scanner.close();
		return list;
	}
}

