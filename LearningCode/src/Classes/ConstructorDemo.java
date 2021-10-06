package Classes;

/**
 * This program demonstrate the rectangle class's constructor
 * @author wanshunjie
 *
 */
public class ConstructorDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Create a Rectangle object, passing 5.0 and 150. as arguments to the constructor
        Rectangle box = new Rectangle(5.0,15.0);

        //Display the length
        System.out.println("The box's length is " + box.getlength());

        //Display the width
        System.out.println("THe box's width is " + box.getWidth());

        //Display the area
        System.out.println("The box's area is " + box.getArea());

    }

}