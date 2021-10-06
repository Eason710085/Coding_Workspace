package API的使用.Random的概述及其使用;

import java.util.Random;

public class Demo2Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//实际范围是0-9
            System.out.println(num);

        }
    }
}
