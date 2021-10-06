package 继承接口多态.继承.成员变量的访问特点;



public class Zi extends Fu {
    int numZi = 20;
    int num = 200;

    public void methodZi (){
        //因为本类中有num，所以用本类的
        System.out.println(num);
    }
}
