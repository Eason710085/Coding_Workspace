package Classes;
/**
 * This program demonstrates the Rectangle class's setLength,setWidth,getLength and getWidth methods
 * @author wanshunjie
 *
 */
public class LengthWidthDemo {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(0, 0);

        //call the object's setLength method passing 10.0 as an argument
        box.setLength(10.0);

        //call the object 's setWidth method passing 20.0 as an argument
        box.setWidth(20.0);

        //display the object's length and width
        System.out.println("The box's length is "+ box.getlength());
        System.out.println("The box's width is "+ box.getWidth());
    }

}
