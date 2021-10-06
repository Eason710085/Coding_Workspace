package API的使用.Scanner概述及其使用;


import java.util.Scanner;

public class DemoAnonymous {
    public static void main(String[] args) {


        //普通使用方式
        //Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();

        //匿名对象方式
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("输入的是：" + num);

        //使用一般写法传入参数
        //Scanner scan = new Scanner (System.in);
        //methodParam(scan);

        //使用匿名对象传参
        //methodParam(new Scanner(System.in));
        Scanner scan = methodReturn();
        System.out.println("输入的是 ：" +num);
        scan.close();
        scanner.close();
    }

    private static void methodParam(Scanner scan) {
        int num = scan.nextInt();
        System.out.println("输入的是；" +num);
    }

    public static Scanner methodReturn (){
        //Scanner scan = new Scanner(System.in);
        //return scan;
        return new Scanner(System.in);
    }
}
