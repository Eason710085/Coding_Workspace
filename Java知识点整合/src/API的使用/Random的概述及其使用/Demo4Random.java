package API的使用.Random的概述及其使用;

import java.util.Random;
import java.util.Scanner;

/**
 * 用代码模拟猜数字的小游戏
 * 思路
 * 1 首先要产生一个随机数字，并且一旦产生就不再变化，用Random的nextInt（）；
 * 2 需要键盘输入，用到Scanner
 * 3 获取键盘输入的数字，用Scanner中的nextInt();
 * 4 已经得到了两个数字，判断（if）一下
 *      如果太大，提示太大，并且充实
 *      如果太小，提示太小，并且充实
 *      如果猜中，游戏结束
 * 5 重试就是再来一次，循环次数不确定，用while（true）
 */
public class Demo4Random {
    public static void main(String[] args) {
        Random r = new Random ();
        int randomNum = r.nextInt(100) +1;//【1-100】
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();//键盘输入的数字

            if(guessNum>randomNum){
                System.out.println("数字大了，请重试");
            }else if(guessNum<randomNum){
                System.out.println("数字小了，请重试");
            }else{
                System.out.println("数字猜对了");
                break;
            }
        }

        sc.close();
        System.out.println("游戏结束");

    }
}
