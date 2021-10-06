package Methods;
/**
 * this program demonstrates a method that returns a reference to a string object
 * @author wanshunjie
 *
 */
public class ReturnString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String customerName;

        customerName = fullName("John","Martin");
        System.out.println(customerName);
    }
    /**
     * The fullName method accepts two String arguments containing a first and last name. it concatenates them into a single string object
     * @param first The first name;
     * @param last The last name;
     * @return A reference to a string object containing the first and last name
     */
    public static String fullName(String first, String last){
        String name;
        name = first + " " + last;
        return name;
    }
}