package API的使用.Random的概述及其使用;
import java.util.Random;
/**
 * random类用来生成随机数字，三个步骤
 * 1 导包
 * import java.util.Random;
 *
 * 2 创建
 * Random r = new Random();
 *
 * 3 使用
 * 获取一个随机int数字(范围是int所有范围，有正负两种) r.nextInt();
 * 获取一个随机的int数字（参数代表类范围，左闭右开区间）；int num =r.nextInt(3);
 * 实际上代表的含义是[0,3)，就就是0-2；
 */
public class Demo1Random {
    public static void main(String[] args) {
        Random r = new Random ();

        int num = r.nextInt();
        System.out.println("随机数字是：" +num);
    }
}
