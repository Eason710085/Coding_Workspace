package 对象数组.ArrayList;

import java.util.ArrayList;

/**
 * 数组的长度不能发生改变
 * 但是ArrayList集合的长度可以随意变化
 *
 * 对于ArrayList来说，有一个尖括号，代表范型
 * 范型：就是装在集合当中的所有元素，全都是充一点什么类型
 * 注意：范型只能是引用类型，不能是基本类型
 *
 * 注意事项
 * 对于ArrayList来说，直接打印得到的不是地址值，而是内容
 * 如果内容是空的，得到的是空的中括号
 */
public class ADemoArraylist {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，里面都是String字符串的数据
        //备注：从jkd1.7开始，右侧的尖括号右侧可以不写内容，但是<>本身还是要写的
        ArrayList <String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加数据，需要用到add方法
        //String类型的arraylist，不能添加其他类型的数据，例如int double
        list.add("张三");
        System.out.println(list);
        list.add("李四");
        list.add("甲");
        list.add("乙");
        System.out.println(list);

    }
}
