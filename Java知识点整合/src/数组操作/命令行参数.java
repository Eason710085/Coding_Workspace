package 数组操作;

/**
 * Java程序的入口是main方法，而main方法可以接受一个命令行参数，它是一个String[]数组。
 *
 * 这个命令行参数由JVM接收用户输入并传给main方法：
 */
public class 命令行参数 {
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }

        }
    }
}
