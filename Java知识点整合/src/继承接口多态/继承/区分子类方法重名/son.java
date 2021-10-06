package 继承接口多态.继承.区分子类方法重名;

public class son extends father {
    public static void main(String[] args) {
        // the subclass can directly use the variable from superclass
        System.out.println("Money inherited by son: " + money);
    }

}