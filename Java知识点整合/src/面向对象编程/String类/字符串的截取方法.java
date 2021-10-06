package 面向对象编程.String类;

/**
 * 字符串的截取方法
 *
 * public  String subString(int index): 截取从参数位置一直到字符串末尾，返回新字符串
 * public String subString (int begin, int end):截取从begin开始，一直到end结束，中间的字符串
 * 备注[begin,end) 包含左边，不包含右边
 */
public class 字符串的截取方法 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld 字符串不能发生改变
        System.out.println(str2);//World 新字符串
        System.out.println("=======");

        String str3 = str1.substring(4,7);
        System.out.println(str3);//oWo

        //下面这种写法，字符串的内容仍然没有改变，
        //下面有两个字符串，一个是Hello，一个是Java
        //本来地址值是Hello 的0x666
        //后来变成了 Java的0x999
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java
    }
}
