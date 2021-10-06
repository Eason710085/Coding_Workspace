package 继承接口多态.继承.继承的格式;

/**
 * 在继承关系中，子类就是一个父类，就是说子类也已被当作父类看待
 * 例如父类是员工，子类是讲师，那么讲师就是一个员工
 *
 * 定义父类格式（一个普通的类定义）
 * public class 父类名称「{
 *
 * }
 *
 * 定义子类格式：
 * public  class 子类名称 extends 父类名称{
 *     //....
 * }
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher ();
        //teacher类中虽然什么都没写，但是会继承来自父类中的method方法
        teacher.method();

        //创建另一个子类 助教
        Assistant assistant = new Assistant();
        assistant.method();
    }

}
