package 面向对象编程.Method;

/**方法的三种调用格式
 * 1. 单独调用： 方法名称（参数）；
 * 2. 打印调用： System.out.println(方法名称(参数));
 * 3. 赋值调用： 数据类型 变量名称 = 方法名称(参数);
 *
 * 注意
 * 当返回值类型为 void 时， 只能够单独调用，不能进行打印调用或者赋值调用
 */
public class B方法的三种调用格式 {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);//无打印结果

        //打印调用
        System.out.println(sum(10,20));

        //赋值调用
        int number = sum(10,20);
        number += 100; //将a , b 值赋值给左边
        System.out.println("变量的值："+ number);

    }

    public static int sum (int a, int b)
    {
        System.out.println("方法已经执行");
        int result = a + b;
        return result;
    }
}
