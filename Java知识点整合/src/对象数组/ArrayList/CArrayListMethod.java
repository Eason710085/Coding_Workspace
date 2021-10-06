package 对象数组.ArrayList;

import java.util.ArrayList;

/**
 * ArrayList当中的常用方法
 *
 * 1 public boolean add(E e) 向集合当中添加元素，参数的类型和泛型一致
 * 对于arrayLIst集合来说，add添加动作一定是成功的，所以返回值可用可不用
 * 但是对于其他集合，add不一定成功
 *
 * 2 public E get(int index) 从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
 * 3 public E remove(int index) 从集合中删除元素，参数就是索引编号，返回值就是被删除掉的元素
 * 4 public int size() 获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class CArrayListMethod {
    public static void main(String[] args) {
        ArrayList <String> list =  new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素
        boolean success = list.add("甲");
        System.out.println(list);
        System.out.println("添加的动作是否成功： " + success);//true

        list.add("乙");
        list.add("丙");
        System.out.println(list);//加的人都能加进来，不用但会值

        //从集合中获取元素，get 索引值从0开始
        String name = list.get(2);//丙
        System.out.println("第二号索引位置：" + name);

        //从集合中删除元素 remove 索引值从0开始
        String whoRemoved =list.remove(2);
        System.out.println("被删除的是： " + whoRemoved);

        System.out.print("删除后的数组：");
        System.out.println(list);

        //获得集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
