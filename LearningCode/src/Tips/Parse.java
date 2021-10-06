package Tips;

public class Parse {
    public static void main(String[] args) {
        /*
        parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析
         */
        int x =Integer.parseInt("9");
        double c = Double.parseDouble("5");
        float  n = Float.parseFloat(String.valueOf(6));
        int b = Integer.parseInt("444",16);//s 十进制表示的字符串， radix指定的基数

        System.out.println(x);
        System.out.println(c);
        System.out.println(n);
        System.out.println(b);

    }
}
