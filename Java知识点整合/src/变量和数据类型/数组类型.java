package 变量和数据类型;

public class 数组类型 {
    public static void main(String[] args) {
    Grades();
    LoopGrades();
    LengthGrades();
    ErrorGrades();
    TuiDuan();
    CannotChange();
    ShuZu();
    }

    /**
     * 如果我们有一组类型相同的变量，例如，5位同学的成绩，可以这么写
     */
    public static void Grades () {
        // 5位同学的成绩:
        int n1 = 68;
        int n2 = 79;
        int n3 = 91;
        int n4 = 85;
        int n5 = 62;
    }

    /**
     * 但其实没有必要定义5个int变量。可以使用数组来表示“一组”int类型。
     */
    public static void LoopGrades () {
        // 5位同学的成绩:
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println("成绩如下");
        for(int i = 0; i < 5; i++ )
        {
            System.out.println(ns[i]);
        }
    }

    /**
     * Java的数组有几个特点：
     * 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
     * 数组一旦创建后，大小就不可改变。
     * 要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。
     * 可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 79;
     * 可以用数组变量.length获取数组大小：
     */
    public static void LengthGrades (){
        // 5位同学的成绩:
        int[] ns = new int[5];
        System.out.println(ns.length); // 5
    }
    /**
     * 数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错
     */
    public static void ErrorGrades(){
        // 5位同学的成绩:
        int[] ns = new int[5];
        int n = 5;
        System.out.println(ns[n]); // 索引n不能超出范围
    }

    /**
     * 也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。
     */
    public static void TuiDuan () {
        // 5位同学的成绩:
        int[] ns = new int[]{68, 79, 91, 85, 62};
        System.out.println(ns.length); // 编译器自动推算数组大小为5
        //还可以进一步简写为：
        //
        //int[] ns = { 68, 79, 91, 85, 62 };
    }

    /**
     * 数组是引用类型，并且数组大小不可变
     */
    /*
    数组大小变了吗？看上去好像是变了，但其实根本没变。

对于数组ns来说，执行ns = new int[] { 68, 79, 91, 85, 62 };时，它指向一个5个元素的数组：

     ns
      │
      ▼
┌───┬───┬───┬───┬───┬───┬───┐
│   │68 │79 │91 │85 │62 │   │
└───┴───┴───┴───┴───┴───┴───┘
执行ns = new int[] { 1, 2, 3 };时，它指向一个新的3个元素的数组：

     ns ──────────────────────┐
                              │
                              ▼
┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
│   │68 │79 │91 │85 │62 │   │ 1 │ 2 │ 3 │   │
└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
但是，原有的5个元素的数组并没有改变，只是无法通过变量ns引用到它们而已。
     */
    public static void CannotChange(){
        // 5位同学的成绩:
        int[] ns;
        ns = new int[] { 68, 79, 91, 85, 62 };
        System.out.println(ns.length); // 5
        ns = new int[] { 1, 2, 3 };
        System.out.println(ns.length); // 3
    }

    /**
     * 字符串数组
     * 如果数组元素不是基本类型，而是一个引用类型，那么，修改数组元素会有哪些不同？
     * 字符串是引用类型，因此我们先定义一个字符串数组：
     */
    public static void ShuZu  (){
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }
}
