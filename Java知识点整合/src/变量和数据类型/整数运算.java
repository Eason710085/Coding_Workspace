package 变量和数据类型;

public class 整数运算 {
    /**
     * 运算优先级
     ()
     ! ~ ++ --
     * / %
     + -
     << >> >>>
     &
     |
     += -= *= /=
     */
    public static void main(String[] args) {
    V();
    C();
    YiChu();
    SolveYiChu();
    ZengJian();
    ZhuanHuan();
    ZhuanXing();
    }

    /**
     *四则运算
     *Java的整数运算遵循四则运算规则，可以使用任意嵌套的小括号。四则运算规则和初等数学一致
     */
    public static void V(){
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
    }

    /**
     *整数的数值表示不但是精确的，而且整数运算永远是精确的，
     *即使是除法也是精确的，因为两个整数相除只能得到结果的整数部分
     *整数的除法对于除数为0时运行时将报错，但编译不会报错
     */
    public static void C(){
        int x = 12345 / 67; // 184
        int y = 12345 % 67; // 12345÷67的余数是17
        System.out.println(x);
        System.out.println(y);
    }

    /**
     * 溢出
     * 整数由于存在范围限制，如果计算结果超出了范围，
     * 就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果
     */
    public static void YiChu(){
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }

    /**
     * 要解决溢出问题
     * 可以把int换成long类型，
     * 由于long可表示的整型范围更大，所以结果就不会溢出
     */
    public static void SolveYiChu(){
        long x = 2147483640;
        long y = 15;
        long sum = x + y;
        System.out.println(sum); // 2147483655
    }

    /**
     * 自增/自减
     * Java还提供了++运算和--运算，它们可以对一个整数进行加1和减1的操作
     */
    public static void ZengJian(){
        int n = 3300;
        n++; // 3301, 相当于 n = n + 1;
        n--; // 3300, 相当于 n = n - 1;
        int y = 100 + (n++); //不能写成++n
        System.out.println(y);
    }

    /**
     *类型强制转换
     * 如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型
     * 例如，short和int计算，结果总是int，原因是short首先自动被转型为int
     */
    public static void ZhuanHuan() {
        short s = 1234;
        int i = 123456;
        int x = s + i; // s自动转型为int
        //short y = s + i; // 编译错误!
        System.out.println(x);
    }

    /**
     * 强制转型
     * 将结果强制转型，即将大范围的整数转型为小范围的整数。强制转型使用(类型)，
     * 例如，将int强制转型为short：超出范围的强制转型会得到错误的结果，
     * 原因是转型时，int的两个高位字节直接被扔掉，仅保留了低位的两个字节
     */
    public static void ZhuanXing(){
        int i1 = 1234567;
        short s1 = (short) i1; // -10617
        System.out.println(s1);
        int i2 = 12345678;
        short s2 = (short) i2; // 24910
        System.out.println(s2);
    }
}
