package 对象数组.ArrayList.ArrayListTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合来存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
 * 要求使用自定义的方法来实现筛选
 *
 * 分析
 * 1 需要创建一个集合，用来存储int数字：<Integer>
 * 2 随机数字用 Random nextInt（）
 * 3 循环20次，把随机数字放入大集合： for循环 add方法
 * 4 定义一个方法，用来进行筛选
 * 筛选：根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 返回值类型 ArrayList 小集合 （里面元素不确定）
 * 方法名称 getSmallList
 * 参数列表 ArrayList 大集合（装着20个数字）
 * 5 判断（if）是偶数， nun% 2 == 0
 * 6 如果是偶数，就放到小集合中，否则不放
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList <Integer> bigList = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;//1-100
            bigList.add(num);
        }
        ArrayList <Integer> smallList = getSmallList(bigList);
        System.out.println("偶数总共有多少个: " + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

    }
    //这个方法，接收大集合，返回小集合结果
    public static ArrayList <Integer> getSmallList(ArrayList<Integer> bigList){
        //创建一个小集合，用来装偶数结果
        ArrayList <Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num%2 ==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
