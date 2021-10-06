package 变量和数据类型;


public class 数据类型 {
    /**
     * Java提供了两种变量类型：基本类型和引用类型
     * 基本类型包括整型，浮点型，布尔型，字符型
     * 基本数据类型
     * 基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：
     * 整数类型：byte，short，int，long
     * 浮点数类型：float，double
     * 字符类型：char
     * 布尔类型：boolean
     */

    /**
     * 一个字节是1byte，1024字节是1K，1024K是1M，1024M是1G，1024G是1T
     * 一个拥有4T内存的计算机的字节数量就是：
     * 4T = 4 x 1024G
     *    = 4 x 1024 x 1024M
     *    = 4 x 1024 x 1024 x 1024K
     *    = 4 x 1024 x 1024 x 1024 x 1024
     *    = 4398046511104
     */
    public static void main(String[] args) {
        Int();
        FloatDouble();
        Boolean();
        Char();
        String();
        Final();
    }
    /**
     * 整形类型最大范围
     * byte：-128 ~ 127
     * short: -32768 ~ 32767
     * int: -2147483648 ~ 2147483647
     * long: -9223372036854775808 ~ 9223372036854775807
     */
    public static void Int(){
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println(i + i2 + i3 + i4 + i5 + l);
    }


    /**
     * 浮点型
     * 对于float类型，需要加上f后缀。
     * 浮点数可表示的范围非常大，float类型可最大表示3.4x1038，而double类型可最大表示1.79x10308。
     */
    public static void FloatDouble(){
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(f1 + f2 + d + d2 + d3);
    }


    /**
     * 布尔类型
     * 布尔类型boolean只有true和false两个值，布尔类型总是关系运算的计算结果
     * 通常JVM内部会把boolean表示为4字节整数
     */
    public static void Boolean(){
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
    }

    /**
     * 字符类型
     * 字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符
     */
    public static void Char (){
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);
    }

    /**
     * 引用类型--String
     * 引用类型最常用的就是String字符串
     */
    public static void String (){
        String s = "hello";
        System.out.println(s);
    }

    /**
     * 常量--final
     *定义变量的时候，如果加上final修饰符，这个变量就变成了常量
     *常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误
     *常量的作用是用有意义的变量名来避免魔术数字（Magic number），
     *例如，不要在代码中到处写3.14，而是定义一个常量。如果将来需要提高计算精度，
     *我们只需要在常量的定义处修改，例如，改成3.1416，而不必在所有地方替换3.14
     */
    public static void Final() {
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
        //PI = 300; // compile error!
        System.out.println(area);
    }

    /**
     * 关键词--var
     * 当类型的名字太长，写起来比较麻烦时，例如：
     * StringBuilder sb = new StringBuilder();
     * 这个时候，如果想省略变量类型，可以使用var关键字：
     * var sb = new StringBuilder();
     * 编译器会根据赋值语句自动推断出变量sb的类型是StringBuilder。对编译器来说，语句：
     * var sb = new StringBuilder();
     * 实际上会自动变成：
     * StringBuilder sb = new StringBuilder();
     * 因此，使用var定义变量，仅仅是少写了变量类型而已。
     */

    /**
     *
     */

}
