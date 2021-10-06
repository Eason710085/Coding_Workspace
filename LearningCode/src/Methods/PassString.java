package Methods;
/**This program demonstrates that string arguments cannot be vhanged
 *
 * @author wanshunjie
 *
 */
public class PassString {

    public static void main(String[] args) {

        //create a string object containing "Shakespeare"
        //the name variable references the object
        String name = "Shakespeare";

        //display the string referenced by the name variable
        System.out.println("In main, the name is "+ name);

        //call the changeName method, passing the contents of the name variable as an argument
        changeName(name);

        //display the string referenced by the name variable
        System.out.println("back in main. the name is " + name);
    }
    /**
     * The changeMe method accepts a string as its argument and assigns the string parameter to a new string
     *
     */
    public static void changeName(String str){
        //create a string object containing "Dickens"
        //assign its address to the str parameter variable
        str = "Dickens";

        //display the string reference by str
        System.out.println("In changeName, the name "+ "is now "+str);
    }

}
