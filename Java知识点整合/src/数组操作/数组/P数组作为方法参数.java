package 数组操作.数组;

/**array parm
 *数组可以作为方法的参数，
 * 当调用方法的时候，向方法的小括号进行传参，传递进去的是数组的地址值
 */
public class P数组作为方法参数 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};

        printArray(array);//传递进去的是array的地址值
        System.out.println("===AA====");
        printArray(array);
        System.out.println("===BB====");

    }
    /**
     * 三要素
     * 返回值类型  只是进行打印，不需计算，也没有结果，用void
     * 方法名称  printArray
     * 参数列表  必须给一个数组，才能打印其中元素。int[]array
     *
     * */
    public static void printArray (int [] array){
        System.out.println("printArray方法收到的参数是：");
        System.out.println(array);//地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
