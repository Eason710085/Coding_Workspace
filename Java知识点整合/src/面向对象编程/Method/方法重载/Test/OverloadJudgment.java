package 面向对象编程.Method.方法重载.Test;

public class OverloadJudgment {
   /*
    1 public static void open (){ } //正确重载
    2 public static void open (int a){ } //正确重载
    3 static void open (int a, int b){ }//代码错误：和第8行冲突
    4 public static void open (double a, int b){ } //正确重载
    5 public static void open (int a, double b){ } //代码错误：和第六行冲突
    6 public void open (int i, double b){ }//代码错误：和第五行冲突
    7 public static void OPEN (){ } //代码正确不会报错，但是不会有效执行
    8 public static void open (int i, int j){ } //代码错误：和第三行冲突

    */
}
