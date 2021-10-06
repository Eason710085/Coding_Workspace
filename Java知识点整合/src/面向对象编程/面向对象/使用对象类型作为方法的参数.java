package 面向对象编程.面向对象;

import 面向对象编程.面向对象.Phone;

/**
 * 当一份对象作为参数，传递到方法当中时，实际传递到是对象到地址值
 */
public class 使用对象类型作为方法的参数 {
    public static void main(String[] args) {

        Phone one  = new Phone ();
        one.brand= "iphone";
        one.price = 9999;
        one.color = "black";

        method(one);//传递进去的参数是地址值
    }

    public static void method (Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
