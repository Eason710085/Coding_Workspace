package 面向对象编程.Static关键字;

public class StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101 教室";

        Student one = new Student("甲",20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
        System.out.println("=========");

        Student two = new Student("乙",40);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);
    }
}
