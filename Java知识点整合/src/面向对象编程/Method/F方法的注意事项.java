package 面向对象编程.Method;



/**
 * 使用方法的时候
 * 1 方法应该定义在类当中，但不能在方法中在定义方法，不能嵌套
 * 2 方法定义无先后顺序
 * 3 方法定义后不会执行，需要调用（单独调用；打印调用；赋值调用）
 * 4 如果方法有返回值，那么必须写return "返回值"，不能没有（void 除外）
 * 5 return 后面的返回值数据，必须和方法的返回值类型对应起来
 * 6 对于一个void 没有返回值的方法，不能写return后面的返回值，只能写return自己
 * 7 对于void方法当中最后一行的return，可以省略不写
 * 8 一个方法中， 可以有多个return， 但是必须保证同时只有一个被执行到, 不能连写两个return
 *
 */
public class F方法的注意事项 {

    //tip 6
    public static void methodVoidTip6 (){

        //return 10;  错误的写法，方法没有返回值，return后面就不能写返回值
        return; //没有返回值，只是方法结束的执行而已
    }

    //Tip 7
    public static void method7 (){
        System.out.println("AAA");
        System.out.println("BBB");
        //return; 可以省略不写
    }

    //Tip 8
    public static int getMaxTip8 (int a, int b) {
        /*方法一
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;*/

        //方法二
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
