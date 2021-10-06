package 面向对象编程.封装性.构造方法;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("==========");
        Student stu2 = new Student("zhangsan",19);

        System.out.println("姓名："  +stu2.getName()+"年龄：" +stu2.getAge());
    }
}

