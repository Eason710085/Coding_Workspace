package 流程控制.条件语句;

public class If判断 {
    public static void main(String[] args) {
    Judge();
    Judge1();
    ShengLue();
    NotGoodtoShengLue();
    Else();
    Else1();
    BianJie();
    WuCha();
    ChangeWuCha();
    PanDuan();
    euqals();
    AvoidNullPointerException();
    }

    /**
     * 条件判断:
     * 在Java程序中，如果要根据条件来决定是否执行某一段代码，就需要if语句。
     *
     * if语句的基本语法是：
     * if (条件)
     * {
     *     // 条件满足时执行
     * }
     */
    //根据if的计算结果（true还是false），JVM决定是否执行if语句块（即花括号{}包含的所有语句）
    public static void Judge (){
        int n = 70;
        if (n >= 60) {
            System.out.println("及格了");
        }
        System.out.println("END");
    }

    /**
     * 当条件n >= 60计算结果为true时，if语句块被执行，将打印"及格了"，否则，if语句块将被跳过。修改n的值可以看到执行效果。
     *
     * 注意到if语句包含的块可以包含多条语句：
     */
    public static void Judge1 (){
        int n = 70;
        if (n >= 60) {
            System.out.println("及格了");
            System.out.println("恭喜你");
        }
        System.out.println("END");
    }

    /**
     * 当if语句块只有一行语句时，可以省略花括号{}：
     */
    public static void ShengLue(){
        int n = 70;
        if (n >= 60)
            System.out.println("及格了");
        System.out.println("END");
    }
    /**
     * 但是，省略花括号并不总是一个好主意。
     * 假设某个时候，突然想给if语句块增加一条语句时：
     * 由于使用缩进格式，很容易把两行语句都看成if语句的执行块，但实际上只有第一行语句是if的执行块。
     * 在使用git这些版本控制系统自动合并时更容易出问题，所以不推荐忽略花括号的写法。
     */
    public static void NotGoodtoShengLue(){
        int n = 50;
        if (n >= 60)
            System.out.println("及格了");
        System.out.println("恭喜你"); // 注意这条语句不是if语句块的一部分
        System.out.println("END");
    }

    /**
     * else
     * if语句还可以编写一个else { ... }，当条件判断为false时，将执行else的语句块：
     */
    public static void Else (){
        int n = 70;
        if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }

    /**
     * 修改上述代码n的值，观察if条件为true或false时，程序执行的语句块。
     *
     * 注意，else不是必须的。
     *
     * 还可以用多个if ... else if ...串联。例如：
     */
    public static void Else1(){
        int n = 70;
        if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }

    /**
     * 使用if时，还要特别注意边界条件
     */
    public static void BianJie(){
        int n = 90;
        if (n > 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
    }

    /**
     * 假设我们期望90分或更高为“优秀”，上述代码输出的却是“及格”，原因是>和>=效果是不同的。
     *
     * 前面讲过了浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此，判断浮点数相等用==判断不靠谱：
     */
    public static void WuCha (){
        double x = 1 - 9.0 / 10;
        if (x == 0.1) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
    }

    /**
     * 正确的方法是利用差值小于某个临界值来判断
     */
    public static void ChangeWuCha (){
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
    }

    /**
     * 判断引用类型相等
     * 在Java中，判断值类型的变量是否相等，可以使用==运算符。
     * 但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
     * 例如，下面的两个String类型，它们的内容是相同的，但是，分别指向不同的对象，用==判断，结果为false：
     */
    public static void PanDuan (){
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
    }

    /**
     * 要判断引用类型的变量内容是否相等，必须使用equals()方法：
     */
    public static void euqals (){
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }
    /*
     注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException：
     String s1 = null;
        if (s1.equals("hello")) {
            System.out.println("hello");
     */

    /**
     * 要避免NullPointerException错误，可以利用短路运算符&&：
     */
    public static void AvoidNullPointerException (){
        String s1 = null;
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        }
    }
}
