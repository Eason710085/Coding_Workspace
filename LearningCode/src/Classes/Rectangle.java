package Classes;
/*
 * rectangle class, phase 1 under construction
 */


public class Rectangle {

    private double length;
    private double width;

    /**
     * Constructor
     * @param len The length of the rectangle
     * @param w The width of the rectangle
     */
    public Rectangle(double len, double w) {
    }
    /**
     * the setLength method stores a value in the length field
     * @param len the value to store in length
     */

    public void setLength(double len){
        length = len;
    }
    /**
     * The setWidth method stores a value in the width field
     * @param w The value to store in width
     */

    public void setWidth (double w){
        width = w;
    }

    /**The getLegth method returns a Rectangle object's length
     * @return length;
     *
     */
    public double getlength(){
        return length;
    }
    /**
     * The Width method returns a Rectangle object's width
     * @return The value in the width field
     */
    public double getWidth(){
        return width;
    }
    /**
     * The getArea method returns a Rectangle object's area
     * @return the product of length time width		 */

    public double getArea(){
        return length*width;
    }

}