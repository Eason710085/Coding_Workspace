package 继承接口多态.继承.继承中方法的覆盖重写;

import 继承接口多态.继承.成员方法的访问特点.Zi;

/**
 * 在父子类的继承关系当中，创建子类对象，访问成员方法的规则
 * 创建的对象是谁，就优先用谁，如果没有则往上找
 * 注意事项
 * 无论是成员方法，还是成员变量，如果没有都是向上找父类，绝对不会向下找子类
 *
 * 重写 override
 * 概念：在继承关系中，方法的名称一样，参数列表也一样，
 * 重写（override）方法的名称一样，参数列表「也一样」覆盖复写
 * 重载（overload）方法的名称一样，参数列表「不一样」
 *
 * 方法的覆盖重写特点：创建的是子类对象，则优先使用子类方法
 * */
public class ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //创建的是new了一个子类对象，所以优先用子类
        zi.method();
    }
}
