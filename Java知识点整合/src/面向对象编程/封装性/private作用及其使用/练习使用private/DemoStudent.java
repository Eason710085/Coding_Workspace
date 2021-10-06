package 面向对象编程.封装性.private作用及其使用.练习使用private;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("年龄：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是否为男性" +stu.isMale());
    }
}
