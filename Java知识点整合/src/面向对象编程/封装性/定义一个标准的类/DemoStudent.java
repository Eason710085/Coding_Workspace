package 面向对象编程.封装性.定义一个标准的类;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(19);
        System.out.println("姓名：" + stu1.getName() +"年龄" + stu1.getAge());
        System.out.println("===========");


        //直接在Student()括号里写入数据，省去setName，setAge步骤
        Student stu2 = new Student("张三",19);
        System.out.println("姓名：" + stu2.getName() +"年龄" + stu2.getAge());
        stu2.setAge(22);//再次更改
        System.out.println("姓名：" + stu2.getName() +"年龄" + stu2.getAge());

    }
}
