package API的使用.Scanner概述及其使用;
import java.util.Scanner;//1 导包
/**
 * Scanner类的功能，可以实现键盘输入数据，到程序中
 * 引用类型到一般使用步骤
 * 1 导包
 * import 包路径.类名称；
 * 如果需要使用到目标类和当前类位于同一个包下，则可以省略导包语句
 * 只有Java.lang 包下到内容不需要导包，其他包都需要import语句
 *
 * 2 创建
 * 类名称 对象名 = new 类型称();
 *
 * 3 使用
 * 对象名.成员方法名();
 *
 * 获取键盘输入的一个int数据 int num = scan.nextInt();
 * 获取键盘输入的一个字符串 String str =  scan.next();
 */
public class DemoScanner {
    public static void main(String[] args) {
        //2 创建
        //System.in 代表从键盘输入
        Scanner scan = new Scanner (System.in);
        //3
        //获取键盘输入的int数子
        int num = scan.nextInt();
        System.out.println("输入的int数字是： "+ num);
        //4
        //获取键盘输入的字符串
        String str = scan.next();
        System.out.println("输入的字符串是："+str);
    }
}
