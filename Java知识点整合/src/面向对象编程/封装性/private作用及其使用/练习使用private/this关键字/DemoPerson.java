package 面向对象编程.封装性.private作用及其使用.练习使用private.this关键字;

public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person ();
        //设置自己的名字
        person.name = "张三";
        person.sayHello("李四");

        System.out.println(person);

    }
}
