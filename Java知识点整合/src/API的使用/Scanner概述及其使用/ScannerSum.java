package API的使用.Scanner概述及其使用;
import java.util.Scanner;
/**
 * 键盘输入两个int数组，求出和
 * 思路
 * 1 需要scanner 来进行键盘输入
 * 2 需要的是两个数字，所以要调用两个Scanner
 * 3 得到了两个数字，要加在一起
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("输入两个数字来求和：");
        int a = scan.nextInt();
        System.out.println("请输入另一个数字");
        int b = scan.nextInt();
        int result = a + b;
        System.out.println("结果是：" + result);
        scan.close();
    }
}
