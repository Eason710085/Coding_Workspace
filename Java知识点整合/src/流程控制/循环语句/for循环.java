package 流程控制.循环语句;

public class for循环 {
    public static void main(String[] args) {
    Sum();
    Sum1();
    Foreach();
    }

    /**
     * 除了while和do while循环，Java使用最广泛的是for循环。
     * for循环的功能非常强大，它使用计数器实现循环。
     * for循环会先初始化计数器，然后，在每次循环前检测循环条件，在每次循环后更新计数器。计数器变量通常命名为i。
     * 我们把1到100求和用for循环改写一下:
     */
    public static void Sum (){
        int sum = 0;
        for (int i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    /**
     * 在for循环执行前，会先执行初始化语句int i=1，它定义了计数器变量i并赋初始值为1，
     * 然后，循环前先检查循环条件i<=100，循环后自动执行i++，
     * 因此，和while循环相比，for循环把更新计数器的代码统一放到了一起。在for循环的循环体内部，不需要去更新变量i。
     *
     * 因此，for循环的用法是：
     *
     * for (初始条件; 循环检测条件; 循环后更新计数器)
     * {
     *     // 执行语句
     * }
     */

    /**
     * 如果我们要对一个整型数组的所有元素求和，可以用for循环实现
     */
    public static void Sum1 (){
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0; i<ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
        //上面代码的循环条件是i<ns.length。因为ns数组的长度是5，
        //因此，当循环5次后，i的值被更新为5，就不满足循环条件，因此for循环结束。
    }

    /*
    灵活使用for循环
for循环还可以缺少初始化语句、循环条件和每次循环更新语句，例如：

// 不设置结束条件:
for (int i=0; ; i++) {
    ...
}
// 不设置结束条件和更新语句:
for (int i=0; ;) {
    ...
}
// 什么都不设置:
for (;;) {
    ...
}
     */

    /**
     * for each循环
     * for循环经常用来遍历数组，因为通过计数器可以根据索引来访问数组的每个元素：
     *
     * int[] ns = { 1, 4, 9, 16, 25 };
     * for (int i=0; i<ns.length; i++) {
     *     System.out.println(ns[i]);
     * }
     * 但是，很多时候，我们实际上真正想要访问的是数组每个元素的值。Java还提供了另一种for each循环，它可以更简单地遍历数组：
     */
    public static void Foreach () {
        int[] ns = {1, 4, 9, 16, 25};
        for (int n : ns) {
            System.out.println(n);
        }
    }
    /**
     和for循环相比，for each循环的变量n不再是计数器，
     而是直接对应到数组的每个元素。for each循环的写法也更简洁。但是，for each循环无法指定遍历顺序，也无法获取数组的索引。
     除了数组外，for each循环能够遍历所有“可迭代”的数据类型，包括后面会介绍的List、Map等。
     */
}
