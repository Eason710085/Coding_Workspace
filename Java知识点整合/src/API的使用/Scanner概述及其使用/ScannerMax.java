package API的使用.Scanner概述及其使用;

import java.util.Scanner;

/**
 * 键盘输入三个int数字，求出其中的最大值
 * 思路
 * 1 需要scanner 来进行键盘输入
 * 2 需要的是三个数字，所以要调用三个nextInt方法
 * 3 既然是三个数字，无法同时判断三个数字谁最大，应该转换为两个步骤
 *   1 首先判断前两个中的最大值。拿到前两个的最大值
 *   2 拿着前两个数字中的最大值，再和第三个狮子比较，得到三个数字中的最大值
 *
 * 4 打印最终结果
 */
public class ScannerMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第1个数字：");
        int a = scan.nextInt();
        System.out.println("请输入第2个数字：");
        int b = scan.nextInt();
        System.out.println("请输入第3个数字：");
        int c = scan.nextInt();

        //首先得到两个数字中的最大值
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        System.out.println("最大值是：" + max);
        scan.close();
    }
    
}
