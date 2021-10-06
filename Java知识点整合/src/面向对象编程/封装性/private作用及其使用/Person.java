package 面向对象编程.封装性.private作用及其使用;
/**
 * 问题描述：定义Person的年龄时，无法防止不合理的数值被设置进来
 * 解决方法：用private关键字将需要保护的成员变量进行修饰
 *
 * 一旦使用private进行修饰，那么本类当中仍然可以随意访问
 * 但是，超出类本类范围之外就不能够直接访问了
 *
 * 间接访问private成员变量，就定义一对Getter/Setter 方法
 * 格式：setXxx；getXxx；
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应
 * 对于Setter来说，不能有返回值，参数类型和成员变量对应
 */
public class Person {

        String name;
        private int age;//可以阻止不合理的数据被设置进来，提高了代码的安全性


    public void show(){
        System.out.println("我叫"+name+"年龄："+age);
    }

    //这个成员方法专门用于向age设置数据
    public void setAge (int num){
        age = num;
        if (num <100  && num>=0){
            age = num;
        }else{
            System.out.println("数据不合理！重新输入");
        }
    }

    //这个成员方法专门用于获得age的数据类型
    public int getAge (){
        return age;
    }

}
