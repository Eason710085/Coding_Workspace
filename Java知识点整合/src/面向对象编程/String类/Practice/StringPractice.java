package 面向对象编程.String类.Practice;

/**按照指定格式拼接字符
 * 分析
 * 1 首先准备一个int【】数组，内容是1，2，3
 * 2 定义一个方法，用来将数组变成字符串
 *
 * 三要素
 * 返回值类型 String
 * 方法名称 fromArrayTpString
 * 参数列表 int[]
 *
 * 3 格式[word1#word2#word3]
 * 用到 for循环，字符串拼接，每个数组元素之前都有一个word滋养，分隔使用的是#
 */
public class StringPractice {
    public static void main(String[] args) {
        int [] array = {1,2,3};

        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int [] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
            str +="word" + array[i] +"]";
        }else{
            str+= "word" + array[i] +"#";
        }
    }
        return str;
    }
}

