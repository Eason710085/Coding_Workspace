package 面向对象编程.Static关键字;

/**
 * 一旦使用static修饰成员方法，那么就成为了静态方法
 * 静态方法不属于对象，而是属于类
 *
 * 如果没有static关键字，那么必须先创建对象，然后通过对象使用它
 * 如果有了static关键字，那么不需要创建对象，直击诶句能通过类名称来使用它
 *
 * 无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称来进行调用
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法()
 *
 * 注意事项
 * 1 静态不能直接访问非静态
 * 原因：在内存当中是先有的静态内容，后有点非静态内容
 * "先人不知道后人，但是后人知道先人"
 * 2 静态方法当中不能有this
 * 原因：this代表当前对象，通过谁调用方法，谁就是对象
 */
public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//创建对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以通过类名称调用
        MyClass.methodStatic();// 正确，不推荐 这样写法在变异之后也会被javac翻译为：类名称.静态方法名
        MyClass.methodStatic();//正确，推荐写法

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        StaticMethod.myMethod();//完全等效
    }
    public static void myMethod (){
        System.out.println("自己的方法");
    }
}
