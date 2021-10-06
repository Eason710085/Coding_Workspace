package 数组操作.数组;

/**
 * 遍历数组：  说得就是对数组中每一个数组进行逐一挨个处理，
 * 默认的处理方式就是打印输出
 */
public class M数组的遍历输出 {
    public static void main(String[] args) {
        int [] array = {15,25,30,40,50};

        //首先使用原始方式。
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println("========");

        //使用循环，次数其实就是数组的长度
        //快速写法： array.fori  回车
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
