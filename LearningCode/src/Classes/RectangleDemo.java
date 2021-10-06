package Classes;
/**
 * THis program demonstrates the Rectangle class's setLength,setWidth,
 * getLength,getWidth,amd getArea methods
 * @author wanshunjie
 *
 */
public class RectangleDemo {

    public static void main(String[] args) {
        //create a Rectangle object
        Rectangle box = new Rectangle(0, 0);

        //set length to 10.0 and width to 20.0
        box.setLength(10.0);
        box.setWidth(20.0);

        //display the lehgth
        System.out.println("The box's length is "+ box.getlength());
        System.out.println("The box's width is "+ box.getWidth());

        //display the area
        System.out.println("The box's area is " + box.getArea());

    }

}