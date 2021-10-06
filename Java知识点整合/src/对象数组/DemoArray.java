package 对象数组;

/**
 * 定义一个数组，用来存储三个person对象
 * 数组有一个缺点，一旦创建，程序运行期间，长度不可以发生改变
 */
public class DemoArray {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，用来存放person类型的对象
        Person  [] array  = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("张三",19);
        Person two = new Person("李四",23);
        Person three = new Person("甲",34);

        //将one中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //Person person = array[1];
        System.out.println(array[1].getName());//李四

    }
}