package API的使用.Array;
import java.util.Arrays;
/**
 * java.util.Array 是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
 *  public static String toString (数组)  将参数数组变成字符串（按照默认格式：[1,2,3,4]）
 *  public static void  sort(数组)  按照默认升序 从小到大，对数组进行重新排序
 *
 *  备注
 *  1 如果是数值，sort按照升序从小到大
 *  2 如果是字符串 sort 按照字母顺序升序
 *  3 如果是自定义类型 那么这个自定义的类要有comparable或者comparatpr接口的支持
 *
 *  */
public class DemoArrays {
    public static void main(String[] args) {
        int [] intArray  = {1,2,3};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);//[1,2,3]

        int []  array1 = {1,3,6,4,8,5,75};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String [] array2 = {"aaa","bbb","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }


}
