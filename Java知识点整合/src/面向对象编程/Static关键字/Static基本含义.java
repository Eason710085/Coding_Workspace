package 面向对象编程.Static关键字;

/**
 * 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
 *
 */
public class Static基本含义 {
    public static void main(String[] args) {

        Student one = new Student("甲",19);
        one.room =" 101教室";
        System.out.println("姓名：" + one.getName() +
                " 年龄： " + one.getAge() +one.room + " 学号：" + one.getId());
        Student two = new Student("乙",20);
        System.out.println("姓名：" + two.getName() +
                " 年龄： " + two.getAge() + one.room+ " 学号：" + two.getId());


    }
}
