package 面向对象编程.String类;

/**
 * ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两种方法
 *
 * public boolean equals (Object obj) 参数可以是任何对象，只有参数是一个字符串并且内容相同才会给true，否则返回false
 *
 * 注意事项：
 * 任何对象都能用object进行接收
 * equals方法具有对称性，也就是a.equals(b)  = b.equals(a)
 * 如果比较双方一个常量，一个变量，推荐把常量字符串写在前面
 * 推荐："abc".equals(str) 不推荐：str.equals("abc")
 *
 * public boolean equalsIgnoreCase(String str) 忽略大小写，进行内容比较
 */
public class StringEquals {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("hello"));//true
        System.out.println("hello".equals(str1));//true

        String str4 = "Hello";
        System.out.println(str1.equals(str4));//false

        System.out.println("=========");
        String str5 = null;
        System.out.println("abc".equals(str5));//推荐
        //System.out.println(str5.equals("abc"));//不推荐，报错，空指针异常
        System.out.println("=========");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
