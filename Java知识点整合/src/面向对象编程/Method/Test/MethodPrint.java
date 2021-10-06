package 面向对象编程.Method.Test;

/**
 * 定义一个方法，打印指定次数的HelloWorld
 */
public class MethodPrint {
    public static void main(String[] args) {
    printCount(5);
    }

    /**
     * 三要素
     * 返回值类型 只是进行打印操作，没有计算和结果要告诉调用处
     * 方法名称 printCount
     * 参数列表 要的值到底打印多少次，否则不知道次数，无法打印
     */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld" +(1 + i));

        }
    }
}
