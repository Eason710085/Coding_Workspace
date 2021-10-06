package Classes;
import javax.swing.JOptionPane;
public class RoomAreas {
    /**
     * this program create three instance of the Rectangle class
     * @param args
     */
    public static void main(String[] args) {

        double number;
        double totalArea;
        String input;

        //create three Rectangle object
        Rectangle kitchen = new Rectangle(0,0);
        Rectangle bedroom = new Rectangle(0,0);
        Rectangle den = new Rectangle(0,0);

        //get and store dimensions of the kitchen
        input = JOptionPane.showInputDialog("What is the kitchen's length?");

        number = Double.parseDouble(input);
        kitchen.setLength(number);
        input = JOptionPane.showInputDialog("What is the kitchen's width");

        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        //get and store the dimensions of the bedroom
        input = JOptionPane.showInputDialog("What is the Bedroom's length");
        number = Double.parseDouble(input);
        bedroom.setLength(number);

        input = JOptionPane.showInputDialog("What is the Bedroom's width");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        //get and store the dimensions of the den
        input =JOptionPane.showInputDialog("What is the den's length");
        number = Double.parseDouble(input);
        den.setLength(number);

        input = JOptionPane.showInputDialog("What is the den's width");
        number = Double.parseDouble(input);
        den.setWidth(number);

        //calculate the total area of the room
        totalArea = kitchen.getArea() + bedroom.getArea()+den.getArea();

        //display the total area of the room
        JOptionPane.showMessageDialog(null, "The total area of the room is "+ totalArea);
        System.exit(0);

    }

}
