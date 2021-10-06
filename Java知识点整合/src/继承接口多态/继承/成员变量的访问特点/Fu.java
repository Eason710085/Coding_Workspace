package 继承接口多态.继承.成员变量的访问特点;

public class Fu {
    int numFu = 10;
    int num = 100;

    public void methodFu (){
        //使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
