package 面向对象编程.Method.方法重载;

/**
 对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦，

 例如以下代码，每一个方法都要有单独的方法名

 public static int sumTwo (int a, int b){
 return a+b;
 }
 public static int sumThree (int a, int b, int c){
 return a+b+c;
 }

 方法的重载 overload 多个方法的名称一样，但是参数列表不同
 方法重载到好处：只要记住一个方法名称，就能实现类似到多个功能
 */

/**
 * 方法重载与下列因素相关
 * 1 参数个数不同
 * 2 参数类型不同
 * 3 参数到多类型顺序不同
 */

/**
 * 方法重载与下列因素无关
 * 1 与参数的名称无关
 * 2 与方法的返回值类型无关
 */
public class 定义及使用 {
    public static void main(String[] args) {
    }

    /**
     * 参数个数不同
     */
    public static int sum (int a, int b){
        System.out.println("两个参数");
        return a+b;
    }
    public static int sum (int a, int b, int c) {
        System.out.println("三个参数");
        return a + b + c;
    }
    public static int sum (int a, int b, int c,int d) {
        System.out.println("四个参数");
        return a + b + c + d;
    }

    /**
     * 参数类型不同
     * 使用double也没有使程序报错
     */
    public static int sum (double a, double b){
        return (int)(a + b); //强制转换
    }

    /**
     *多类型的顺序不同
     */
    public static int sum (int a, double b){
        return  (int)(a + b);
    }
    public static int sum (double a, int b){
        return  (int)(a + b);
    }

    /**
     * 与参数名称无关
     */
    /*
    public static int sum (int x, int y){
        return x+y;
    }*/

    /**
     * 与方法的返回值类型无关
     */
    /*
    public static double sum (int a, int b){
        System.out.println("两个参数");
        return a + b + 0.0;
    }*/


}

