package API的使用.Scanner概述及其使用;

/**
 * 创建对象的标准格式
 * 类名称 对象名 = new 类名称 （）；
 *
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * new 类名称（）；
 *
 * 注意事项
 * 匿名对象只能使用唯一的一次，下次在用得创建一个新的对象
 *
 * 使用建议
 * 如果确定有一个对象只需使用唯一的一次，就可以用匿名对象
 */
public class Anonymous {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one = new Person();
        one.name = "张三";
        one.showName();

        //匿名对象
        new Person().name = "李四";
        new Person().showName();//?
    }
}
