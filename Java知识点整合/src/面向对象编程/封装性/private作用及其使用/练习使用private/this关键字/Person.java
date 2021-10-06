package 面向对象编程.封装性.private作用及其使用.练习使用private.this关键字;

/**
 * 当方法的局部变量和类的成员变量重名的时候，会根据就近原则，优先使用局部变量
 * 如果需要访问本类中的成员变量，需要使用格式：
 * this.成员变量名
 *
 * "通过谁调用的方法，谁就是this"
 */
public class Person {
    String name; //自己的名字

    //name是对方的名字
    //name是自己的名字
    public void sayHello(String name){
        System.out.println(name +"你好，我是" + this.name);
        System.out.println(this);
    }
}
