package 面向对象编程.面向对象;

import 面向对象编程.面向对象.Phone;

public class 使用对象的类型作为方法的返回值 {
    public static void main(String[] args) {
    Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "iphone";
        one.price = 9999;
        one.color = "black";
        return one;
    }
}
