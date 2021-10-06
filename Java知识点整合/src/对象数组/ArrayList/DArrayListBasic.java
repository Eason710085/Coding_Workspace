package 对象数组.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 如果希望向集合ArrayList中存储基本类型数据，必须使用基本类型对应的"包装类"
 * 基本类型      包装类
 * byte         Byte
 * short        Short
 * int          Integer
 * long         Long
 * float        Float
 * double       Double
 * char         Character
 * boolean      Boolean
 *
 * 自动装箱：基本类型==》包装类型
 * 自动拆箱：包装类型==》基本类型
 * 从JDK1.5 开始，支持自动装箱，自动拆箱.
 */
public class DArrayListBasic {
    public static void main(String[] args) {
        ArrayList <String> listA = new ArrayList<>();

        //错误谢范，泛型只能是引用类型，不能是基本类型
        //ArrayList <int> listB = new ArrayList<int>();

        ArrayList <Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC); //[100,200]

        int num = listC.get(1);
        System.out.println("第一号元素是：" + num);
    }
}
