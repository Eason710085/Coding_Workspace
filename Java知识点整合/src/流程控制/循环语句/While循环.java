package 流程控制.循环语句;

public class While循环 {
    public static void main(String[] args) {
    Loop();
    BianJie();
    DeadLoop();
    }

    /**
     * while循环在每次循环开始前，首先判断条件是否成立。
     * 如果计算结果为true，就把循环体内的语句执行一遍，如果计算结果为false，那就直接跳到while循环的末尾，继续往下执行。
     * 我们先看Java提供的while条件循环。它的基本用法是：
     *
     * while (条件表达式)
     * {
     *     循环语句
     * }
     * // 继续执行后续代码
     */

    /**
     * 我们用while循环来累加1到100，可以这么写：
     */
    public static void Loop (){
        int sum = 0; // 累加的和，初始化为0
        int n = 1;
        while (n <= 100) { // 循环条件是n <= 100
            sum = sum + n; // 把n累加到sum中
            n ++; // n自身加1
        }
        System.out.println(sum); // 5050
    }

    /**
     * 注意到while循环是先判断循环条件，再循环，因此，有可能一次循环都不做。
     *
     * 对于循环条件判断，以及自增变量的处理，要特别注意边界条件。思考一下下面的代码为何没有获得正确结果：
     */
    public static void BianJie(){
        int sum = 0;
        int n = 0;
        while (n <= 100) {
            n ++;
            sum = sum + n;
        }
        System.out.println(sum);
    }

    /**
     * 如果循环条件永远满足，那这个循环就变成了死循环。死循环将导致100%的CPU占用，用户会感觉电脑运行缓慢，所以要避免编写死循环代码。
     *
     * 如果循环条件的逻辑写得有问题，也会造成意料之外的结果：
     */
    public static void DeadLoop (){
        //表面上看，上面的while循环是一个死循环，
        //但是，Java的int类型有最大值，达到最大值后，再加1会变成负数，结果，意外退出了while循环
        int sum = 0;
        int n = 1;
        while (n > 0) {
            sum = sum + n;
            n ++;
        }
        System.out.println(n); // -2147483648
        System.out.println(sum);
    }
}
