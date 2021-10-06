package 数组操作.数组;

/**
 * 使用动态初始化数组是，其中的元素将会自动拥有默认值，规则如下：
 * 整数类型 -->默认为0
 * float --> 0.0
 * String --> '\u0000'
 * boolean --> false
 * 引入类型 --> null
 *
 * 注意事项：
 * 静态初始化也有默认值，只不过系统马上将默认值替换为打括号里的具体数值
 */
public class G访问数组的元素 {
    public static void main(String[] args) {
        //动态初始化一个数组
        int [] array = new int [3];

        System.out.println(array);//内存地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("=========");

        //将123赋值给array[1]
        array[1] = 123;
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
    }


}
