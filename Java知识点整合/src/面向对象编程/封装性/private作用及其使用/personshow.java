package 面向对象编程.封装性.private作用及其使用;

/**
 * 问题描述：定义Person的年龄时，无法组织不合理的数值被设置进来
 * 解决方法：用private关键字将需要保护的成员变量进行修饰
 *
 * 一旦使用private进行修饰，那么本垒当中仍然可以随意方法
 * 但是，超出类本垒防伪之外就不呢个直接访问了
 */
public class personshow {
    public static void main(String[] args) {
        Person person = new Person ();
        person.show();

        person.name="Shunjie wan";
        //person.age=19;//直接访问private是错误的
        person.setAge(20);//间接访问private内容
        person.show();
    }
}
