package Methods;
/**
 * Demonstration of hierarchical method calls
 * 分层方法调用的演示
 * @author wanshunjie
 *
 */
public class DeepAndDeeper {
    /**
     defines and calls a simple method
     @param args
     */
    public static void main(String[] args) {
        System.out.println("I am starting in main");
        deep();
        System.out.println("Now i am back in main");
    }
    /**
     displays a message and then calls the deeper method
     */
    public static void deep() {
        System.out.println("I am now in deep");
        deeper();
        System.out.println("Now i am back in deep");
    }
    /**
     display a message
     */
    public static void deeper(){
        System.out.println("I am now in deeper");
    }

}