package 数组操作.数组;

public class H两个指向同一个数组 {
    public static void main(String[] args) {

        int [] arrayA = new int [3];
        System.out.println(arrayA); //地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        System.out.println("========");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println("========");

        //将arrayA数组的地址值赋值给arrayB的数组
        int [] arrayB = arrayA;
        System.out.println(arrayB); //地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//10  //arrayA 玩完剩下的，所以显示arrayA里的值
        System.out.println(arrayB[2]);//20
        System.out.println("========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
        System.out.println("========");

        System.out.println(arrayA[1]);

    }
}
