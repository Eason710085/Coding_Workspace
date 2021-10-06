package 面向对象编程.面向对象;

import java.util.Arrays;

/**printArray
 * 面向过程 当需要实现一个功能的时候，每一个步骤都要亲力亲为，亲自处理每一个细节
 * 面向对象 当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，帮忙做事
 *
 * 面向过程 强调步骤
 * 面向对象 强调对象
 * 面向对象三大特征 封装，继承，多态
 *
 *
 */
public class A面向对象思想的概述 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};

        //打印格式为：[1,2,3,4,5,6,7]
        //使用面向过程
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if(i ==array.length-1){
                System.out.println(array[i] +"]");
            }else{
                System.out.print(array[i] +", ");
            }
        }
        System.out.println("==========");

        //使用面向对象
        //找一个jdk给我们提供好的Arrays类
        //其中的toString方法 就能直接吧数组编程想要格式的字符串
        System.out.println(Arrays.toString(array));
    }

}
