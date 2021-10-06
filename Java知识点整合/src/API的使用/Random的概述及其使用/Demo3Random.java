package API的使用.Random的概述及其使用;

import java.util.Random;

/**
 * 根据一个int变量，来获取随机数字，方位是[1,n]
 *
 * 思路
 * 1 定义一个int变量n，随意赋值
 * 2 要使用Random 三个步骤 导包，创建，使用
 * 3 如果写 10，那么就是0-9，如果想要1-10，可以发现整体+1即可
 * 4 打印随机数字
 */
public class Demo3Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            //本来范围是[0,1),整体+1之后变成了[1,n+1)也就是[1,n]
            int result = r.nextInt(n) +1;//0～n-1
            System.out.println(result);
        }




    }
}
