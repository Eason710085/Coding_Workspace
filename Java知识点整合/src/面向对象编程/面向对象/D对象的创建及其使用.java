package 面向对象编程.面向对象;

/**
 * 通常情况下，一个类不能直接使用没需要根据类创建一个对象，才能使用
 *
 * 1 导包 指出需要使用的类在什么位置
 * import 包名称.类名称；
 * 对于和当前类属于同一个包的情况，可以省略导包语句
 *
 * 2 创建，格式：
 * 类名称 对象名 = new 类名称 （）；
 * student stu = new student ();
 *
 * 3 使用 （分为两种情况）
 * 使用成员变量 对象名.成员变量名
 * 使用成员方法 对象名.成员方法名（参数）
 * （使用谁就用对象名点谁）
 *
 * 注意事项
 * 如果成员变量没有进行赋值，那么就会有一个默认值
 */
public class D对象的创建及其使用 {
    public static void main(String[] args) {
        //1 导包 因为student类在同一个包里，所以省略此步骤

        //2
        // 创建 类名称 对象名 = new 类名称 （）；
        //根据student类创建了一个stu对象
        Student stu = new Student ();

        //3
        // 使用其中的成员变量
        //格式：对象名.成员变量名
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("=========");
        //改变对象当中的成员变量数值内容
        stu.name = "wanshunjie";
        stu.age = 19;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=========");

        //4
        //使用对象的成员方法 格式：
        //对象名.成员方法名()
        stu.eat();
        stu.sleep();
        stu.study();



    }
}
