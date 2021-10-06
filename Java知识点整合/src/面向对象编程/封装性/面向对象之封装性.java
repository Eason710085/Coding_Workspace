package 面向对象编程.封装性;

/**
 * 面向对象三大特征 封装，继承，多态
 * 封装在java中的体现：
 * 1 方法就是一种封装
 * 2 private 也是一种封装
 *
 * 封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class 面向对象之封装性 {
    public static void main(String[] args) {
        int [] array = {5,15,25,35,100};
        int max = getMax(array);
        System.out.println("最大值：" + max);

    }
    //给我一个数组，我还给你一个最大值（妥妥的工具人）
    public static int getMax(int[]array){
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }

        }
        return max;
    }
}
