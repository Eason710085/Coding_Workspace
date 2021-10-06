package Methods;
/**
 * This program demonstrates that two methods may have local variable with the same name
 * @author wanshunjie
 *
 */
public class LocalVariable {

    public static void main(String[] args) {
        texas ();
        california();
    }
    /**
     * The texas method has a local variable named birds
     */
    public static void texas (){
        int birds = 5000;
        System.out.println("In texas there are " + birds + " birds");
    }
    /**
     * The California method also has a local variable
     */
    public static void california(){
        int birds = 3500;
        System.out.println("In california there are " + birds + " birds");
    }
}