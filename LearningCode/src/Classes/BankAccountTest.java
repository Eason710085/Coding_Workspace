package Classes;
import javax.swing.JOptionPane;	//for the JOptionPane class
public class BankAccountTest {

    /**
     * This program demonstrate the BankAccount class
     * @param args
     */
    public static void main(String[] args) {
        String input; //to hold users input

        //get the starting balance
        input = JOptionPane.showInputDialog("What is your account's starting balance? ");

        //create a BankAcount object
        BankAccount account = new BankAccount(input);

        //get the amount of pay
        input = JOptionPane.showInputDialog("How much were you paid this month?");

        //deposit the user's pay into the account
        account.deposit(input);

        //display the new balance
        JOptionPane.showMessageDialog(null, String.format("Your pay has been deposited.\n"
                + "Your current balance is $%,.2f", account.getBalance()));

        //withdraw some cash from the account
        input = JOptionPane.showInputDialog("How much would you like to withdraw?");
        account.withdraw(input);

        //display the new balance
        JOptionPane.showMessageDialog(null, String.format("Now your balance is $%.2f", account.getBalance()));
        System.exit(0);
    }

}

