package 面向对象编程.Method.Test;

/**
 * 定义一个方法，就要求出1-100 之间所有数字只和
 */
public class MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是： "+ getSum());
    }

    /**
     * 三要素
     * 返回值 有返回值，计算结果是int
     * 方法名称 getSum
     * 参数列表 数据范围已知，不需任何条件，不需要参数
     */
    public static int getSum (){
        int sum  = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
