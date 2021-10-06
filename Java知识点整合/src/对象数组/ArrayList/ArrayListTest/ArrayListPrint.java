package 对象数组.ArrayList.ArrayListTest;

import java.util.ArrayList;

/**
 * 定义用指定格式打印集合的方法（ArrayList类型作为参数）使用{}扩起集合，使用@分割每个元素
 * 格式参照{元素@元素@元素}
 *
 * System.out.println(list);[10,20,30]
 * printArrayList(list); {10@20@30}
 *
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("甲");
        list.add("乙");
        list.add("丙");
        list.add("丁");
        System.out.println(list);//[甲, 乙, 丙, 丁]

        printArrayList(list);
    }

    /**
     * 返回值类型 只是进行打印，无运算无结果，用void类型
     * 方法名称 printArrayList
     * 参数列表 ArrayList
     */
    public static void printArrayList (ArrayList<String> list){
       // {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i ==list.size()-1){
                System.out.println(name +"}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
