package 面向对象编程.封装性.定义一个标准的类;

/**
 * 一个标准的类通常要满足下面四个组成部分
 * 1 所有变量都要使用priva关键字修饰
 * 2 为所有成员变量编写一对Getter/Setter方法
 * 3 编写一个无参数的构造方法
 * 4 编写一个全参数的构造方法
 * 这样的标准类也叫Java Bean
 */
public class Student {
    private String name;
    private int age;

    //无参数的构造方法
    //在IDEA的code选项中，选择generate
    //点击constructor
    //点击select none（无参数）
    public Student() {
    }

    //有参数的构造方法
    //在IDEA的code选项中，选择generate
    //点击constructor
    //全选（有参数）
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //在IDEA的code选项中，选择generate
    //选择Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
