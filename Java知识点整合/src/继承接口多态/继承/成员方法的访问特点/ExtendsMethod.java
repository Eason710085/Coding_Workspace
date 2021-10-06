package 继承接口多态.继承.成员方法的访问特点;

/**
 * 在父子类的继承关系当中，创建子类对象，访问成员方法的规则
 * 创建的对象是谁，就优先用谁，如果没有则往上找
 * 注意事项
 * 无论是成员方法，还是成员变量，如果没有都是向上找父类，绝对不会向下找子类
 *
 */
public class ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //创建的是new了一个子类对象，所以优先用子类
        zi.method();
    }
}
