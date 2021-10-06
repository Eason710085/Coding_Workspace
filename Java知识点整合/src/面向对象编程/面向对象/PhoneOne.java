package 面向对象编程.面向对象;

public class PhoneOne {
    public static void main(String[] args) {
        //根据phone类创建一个名为one的对象
        //格式类名称 对象名 = new 类名称（）；

        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("=======");

        one.brand =  "iphone";
        one.price = 9999;
        one.color = "black";
        System.out.println(one.brand);//iphone
        System.out.println(one.price);//9999
        System.out.println(one.color);//black
        System.out.println("=======");

        one.call("乔布斯");//打电话
        one.sendMessage();

    }
}
