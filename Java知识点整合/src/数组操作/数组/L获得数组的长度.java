package 数组操作.数组;

/**
 * 如何获得数组的长度，格式：
 * 数组名称 length
 *
 * 这将会得到一个int数字，代表数组的长度
 *
 * 数组一旦创建，程序运行期间长度不可改变
 */
public class L获得数组的长度 {
    public static void main(String[] args) {
        int [] arrayA = new int [3];//动态初始化，已经知道了长度

        int [] arrayB = {1,2,4,4,5,7,8,9};//静态初始化

        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);

        System.out.println("===========");

        int [] arrayC = new int [3];
        System.out.println(arrayC.length);//3

        //这是两个数组，new 了两个，arrayC只不过是名字
        //当 重新new 了arrayC后， arrayC 就使用新的地址值
        //之前的旧数组采用回收机制回收
        arrayC = new int [5];
        System.out.println(arrayC.length);//5
    }
}
