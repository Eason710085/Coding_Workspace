package 面向对象编程.Method;

/**
 有返回值的方法：（可以使用三种调用方式）

 调用方法 -->找到方法-->传递参数-->执行方法体-->将返回值交还给调用处+
 ^---<<-----<<-带着返回值--<<-----<<---<<-------------------+

 无返回值的方法：(void只能使用单独调用)

 调用方法 -->找到方法-->传递参数-->执行方法体-->直接结束+
 ^---<<-----<<-什么都不带--<<-----<<---<<---------+
 */


/**有返回值
 * 定义一个方法，用来「求出」两个数字只和
 * 题目变形： 定义一个方法。用来「打印」两个数字只和
 */
public class E对比有返回值和无返回值 {
    public static void main(String[] args) {
        //main方法，来调用getSum
        //让getSum 来计算记过，并把num值告诉main方法
        int num = getSum(10,20);
        System.out.println("返回值是："  + num);
        System.out.println("=========");

        printSum(100,200);//赋值调用
        System.out.println("=========");

        System.out.println(getSum(2, 3));//打印调用（正确）
        getSum(3,5);//单独调用（正确，但没有用到返回值）

        //对于void没有返回值的方法，只能单独调用
        printSum(10,20);

        //System.out.println(printSum(2,3));（打印调用，错误）

        //int num2 = printSum(10,20); (赋值调用，错误)

    }

    /**无返回值
     * 方法：负责两数相加，我有返回值int，谁调用，就把结果告诉谁
     *
     * @param a
     * @param b
     * @return result
     */
    public static int getSum (int a, int b)
    {
        int result = a + b;
        return result;
    }

    /**
     * 负责两数相加
     * 无返回值，不用main  打印输出，自己进行打印输出
     * void 无 return
     * @param a
     * @param b
     */
    public static void printSum (int a, int b)
    {
        int reslut = a + b;
        System.out.println("结果是 ：" +reslut);
    }
}

