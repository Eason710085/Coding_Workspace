package 数组操作.数组;

/**
 * 所有的引用类型变量，都能赋值为一个null值，但表其中什么都没有
 * 数组必须进行new初始化，才能使用其中元素
 * 如果赋值了null，没有进行new创建
 * 将会发生 空指针异常 --》NullPointerException
 */

public class K空指针异常 {
    public static void main(String[] args) {
        int [] array = null;

        //NullPointerException
        System.out.println(array[0]);
    }
    //正确方法
    public static void solution (){
        int [] array = null;
        array = new int [3];
        System.out.println(array[0]);
    }
}
