package 面向对象编程.Method;

import java.util.MissingFormatArgumentException;

/**
 * 有参数：小括号里有内容， 当一个方法需要数据条件，才能完成任务
 * 例如：sum = a + b; 需先知道 a，b 值。
 *
 * 无参数：小括号中留空。一个方法不需要任何数据条件，就能完成运行
 * 例如： 打印十次 sout("HelloWorld"); 不需要数据条件
 *
 */
public class D对比有参数和无参数 {
    public static void main(String[] args) {
    method1(10,20); //有参数
    method2(); //无参数
    }

    /**有参数
     * 数字相乘，需先知道两个数字的值，才能进行计算
     * 有参数
     */
    public static void method1 (int a, int b)
    {
        int result = a*b;
        System.out.println("result = " + result);
    }

    /**无参数
     * 打印10次文本字符
     */
    public static void method2 ()
    {
        for (int i = 0; i< 10; i++)
        {
            System.out.println("HelloWorld" + i);
        }

    }
}
