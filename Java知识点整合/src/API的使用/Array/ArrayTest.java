package API的使用.Array;

import java.util.Arrays;

/**
 * 使用Array相关的API 讲一个随机字符串中的所有字符升序排列，并倒序打印
 *
 */
public class ArrayTest {
    public static void main(String[] args) {
        String str  = "sdgsdfvgtrjth";

        //如何使用升序排列 sort
        //必须是一个数组
        //String==》数组，用toCharArray()
        char [] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组升序排列

        //需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
                System.out.println(chars[i]);
        }
    }
}
