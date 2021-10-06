package 面向对象编程.Method.方法重载.Test;

//byte, short, int, long, float, double, char, boolean
//String
//在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式
public class OverloadPrint {

    public static void main(String[] args) {
        myPrint(100);//int
        myPrint("Hello");//String
        myPrint(2332.3);
        
    }


    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(double num){
        System.out.println(num);
    }

    public static void myPrint(char num){
        System.out.println(num);
    }

    public static void myPrint(boolean bool){
        System.out.println(bool);
    }

    public static void myPrint(String str){
        System.out.println(str);
    }
}
