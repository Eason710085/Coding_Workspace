package 面向对象编程.Method.Test;

/**
 * 定义一个方法，用来判断两个数字是否相同
 *
 * 三要素
 * 1 返回值类型：boolean
 * 2 方法名称：isSame
 * 3 参数列表：int a, int b
 */
public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));//false
        System.out.println(isSame(20,20));//true
    }

    public static boolean  isSame (int a, int b)
    {
        boolean same;
        /*方法1
        if ( a == b){
            same = true;
        }else{
            same = false;
        }*/

       /*方法2
         same = a ==b ?  true : false;
        */
        /*
        boolean same =  a ==b;
         */
        //方法3
        return a==b;
    }
}
