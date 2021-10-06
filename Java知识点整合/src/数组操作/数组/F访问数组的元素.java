package 数组操作.数组;

/**
 * 二进制：01
 * 十进制：123456789
 * 十六进制：1234567890abcdef
 *
 * 访问数组元素的格式：数组名称[索引值]
 * 索引值： 就是一个int数字，代表数组当中元素的编号
 * 注意：索引值从0开始，一直到"数组的长度-1"为止
 */
public class F访问数组的元素 {
    public static void main(String[] args) {
        int [] array = {10,20,30}; //静态初始化省略格式

        //直接打印数组名称，得到的是数组对应的：内存地址哈希值
        System.out.println(array);  //[I@61bbe9ba

        //直接打印数组中的元素
        System.out.println(array[0]); //打印第0号元素
        System.out.println(array[1]); //打印第1号元素
        System.out.println(array[2]); //打印第2号元素
        System.out.println("===========");

        //将数组中的元素，赋值给变量，打印变量
        int num = array[1];
        System.out.println(num);
    }

}
