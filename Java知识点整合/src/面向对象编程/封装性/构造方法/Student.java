package 面向对象编程.封装性.构造方法;

/**
 * 当我们通过关键字new来创建对象时，其实就是在调用构造方法
 * 格式：
 * public 类名称（参数类型 参数名称）{
 *       方法体
 * }
 *
 * 注意事项
 * 1 构造方法的名称必须和所在的类名称完全一样 就连大小写也要一样
 * 2 构造方法不要写返回值类型 连void 都不写
 * 3 构造方法不能return一个具体点返回值
 * 4 如果没有编写任何构造方法，那么编译器就会默认赠送一个构造方法，没有参数，方法提什么事情都不做
 * 5 一旦编写了至少一个构造方法，那么编译器将不再赠送
 * 6 构造方法也是可以进行重载的
 */
public class Student {

    private String name;
    private int age;
    //注意事项 4
    public Student() {
        System.out.println("无参构造方法已经执行");
    }

    public Student (String name,  int age){
        System.out.println("全参构造方法已经执行");
        this.name = name;
        this.age = age;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public int getAge (){
        return age;
    }
}
