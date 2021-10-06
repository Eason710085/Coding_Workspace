package 数组操作.数组;

/**
 *使用if嵌套的for循环求出数组中的最值
 */
public class N求出数组中的最值 {
    public static void main(String[] args) {
        //求最大值
        int [] array = {4,15,20,40,3,456,32};

        int max = array[0];//
        for (int i = 1; i <array.length; i++){
            //如果当前元素比max更大，则换其他的
            if (array[i] > max){
                max  = array[i];
            }
        }
        //谁数值更大，就是max
        System.out.println("最大值：" +max);

        minimum();
    }

    public static void minimum (){//求最小值
        int [] arrayB = {4,15,20,40,3,456,31,-20};

        int min = arrayB[0];//
        for (int i = 1; i <arrayB.length; i++){
            //如果当前元素比max更大，则换其他的
            if (arrayB[i] < min){
                min = arrayB[i];
            }
        }
        //谁数值更大，就是max
        System.out.println("最小值：" +min);

    }
}
