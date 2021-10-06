package Methods;
import javax.swing.JOptionPane;
public class CreditCard {
    /**
     * This program use two void method
     * @param args
     */
    public static void main(String[] args) {
        double salary;  //Annual salary
        int creditRating; //Credit rating
        String input; //to hold the user input

        //get the user's annual salary
        input = JOptionPane.showInputDialog("What isyour annual salary");
        salary = Double.parseDouble(input);

        //get the user's credit rating(1 through 10)
        input = JOptionPane.showInputDialog("On a scale of 1 through 1o, what is your credit rating?\n");
        creditRating = Integer.parseInt(input);

        //determine whether the user qualifies
        if (salary >= 2000 && creditRating>=7)
            qualify();
        else
            noQualify();


        System.exit(0);
    }

    /**
     * The qualify method informs the users that he or she qualifies for the credit card
     */

    public static void qualify () {
        JOptionPane.showMessageDialog(null, "Congratulations! you qualify for the credit rating");
    }
    /**
     * The noQualify method informs the user that he or she does not qualify for the credit card
     */
    public static void noQualify (){
        JOptionPane.showMessageDialog(null, "I am sorry, you are not qualify for the credit rating");
    }
}