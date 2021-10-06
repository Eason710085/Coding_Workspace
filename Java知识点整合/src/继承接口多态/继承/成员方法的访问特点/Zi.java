package 继承接口多态.继承.成员方法的访问特点;

public class Zi extends Fu{

    public void methodZi (){
        System.out.println("子类方法执行");
    }
    public void method (){
        System.out.println("子类重名方法执行");
    }
}
