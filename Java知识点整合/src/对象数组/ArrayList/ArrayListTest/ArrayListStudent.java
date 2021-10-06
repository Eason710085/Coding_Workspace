package 对象数组.ArrayList.ArrayListTest;

import java.util.ArrayList;

/**
 * 题目 自定义四个学生对象，添加到集合，并遍历
 *
 * 思路：
 * 1 自定义 Student 学生类，四个部分
 * 2 创意一个集合 用来存储学生对象 泛型<Student>
 * 3 根据类，创建四个学生对象
 * 4 将4 个学生
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();

        Student one = new Student("甲",20);
        Student two = new Student("乙",10);
        Student three = new Student("丙",40);
        Student four = new Student("丁",12);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName()+", 年龄：" + stu.getAge());

        }

    }
}
