package 继承接口多态.继承.成员变量的访问特点;

/**
 * 在父子类的继承关系当中没如果成员变量重名，则创建子类对象时，访问有两种凡是
 * 1 直接通过子类对象访问成员变量
 *      等号左边是谁，就优先用谁，没有则向上找
 * 2 间接通过成员方法访问成员变量
 *      方法属于谁，就优先用谁，没有则向上找
 */
public class ExtendField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容
        System.out.println("=======");

        Zi zi = new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20
        System.out.println("=======");

        //直接访问
        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//优先子类 200
        //System.out.println(zi.abc);//到处都没有，编译报错
        System.out.println("=======");

        //间接通过成员方法访问成员变量
        zi.methodZi();//这个方法是子类的，优先用子类的没有再向上找
        //这个方法是在父类中定义的
        zi.methodFu();//100
    }
}
