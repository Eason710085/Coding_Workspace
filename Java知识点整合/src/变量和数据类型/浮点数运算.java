package 变量和数据类型;

public class 浮点数运算 {
    public static void main(String[] args) {
    WuCha();
    CompareWucha();
    TiSheng();
    YiChu();
    ZhuanXing();
    }

    /**
     * 浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算
     * 浮点数范围虽大，但是无法精确表示
     * 浮点数0.1在计算机中就无法精确表示，因为十进制的0.1换算成二进制是一个无限循环小数，
     * 很显然，无论使用float还是double，都只能存储一个0.1的近似值。但是，0.5这个浮点数又可以精确地表示
     * 浮点数运算会产生偏差
     */
    public static void WuCha(){
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);
    }

    /**
     * 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果
     * 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数
     */
    public static void CompareWucha(){
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 比较x和y是否相等，先计算其差的绝对值:
        double r = Math.abs(x - y);  // 再判断绝对值是否足够小:
        if (r < 0.00001) {
            // 可以认为相等
            System.out.println("相等");
        } else {
            // 不相等
            System.out.println("不相等");
        }
    }

    /**
     * 类型提升
     * 如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
     */
    public static void TiSheng(){
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);
        //需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。例如：
        double d1 = 1.2 + 24 / 5; // 5.2
        System.out.println(d1);
        //计算结果为5.2，原因是编译器计算 24/5 这个子表达式时，按两个整数进行运算，结果仍为整数4
    }

    /**
     * 溢出
     * 整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值
     * NaN表示Not a Number
     * Infinity表示无穷大
     * -Infinity表示负无穷大
     */
    public static  void YiChu(){
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
    /**
     * 强制转型
     * 可以将浮点数强制转型为整数。
     * 在转型时，浮点数的小数部分会被丢掉。
     * 如果转型后超过了整型能表示的最大范围，将返回整型的最大值。
     */
    public static void ZhuanXing(){
        int n1 = (int) 12.3; // 12
        int n2 = (int) 12.7; // 12
        int n3 = (int) -12.7; // -12
        int n4 = (int) (12.7 + 0.5); // 13
        int n5 = (int) 1.2e20; // 2147483647
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        //如果要四舍五入，可以对浮点数加上0.5再强制转型
        double d = 2.6;
        int n = (int) (d + 0.5);
        System.out.println(n);

    }
}
