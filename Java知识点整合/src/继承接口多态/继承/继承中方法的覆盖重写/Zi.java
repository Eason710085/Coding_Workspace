package 继承接口多态.继承.继承中方法的覆盖重写;


public class Zi extends Fu {


    @Override
    //起到安全检测的作用，没报错，就是正确的覆盖重写
    //这个注解，可以不写，只要满足覆盖重写要求就是正确的
    public void method (){

    }
}
