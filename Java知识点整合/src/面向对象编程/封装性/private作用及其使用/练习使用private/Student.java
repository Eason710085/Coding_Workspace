package 面向对象编程.封装性.private作用及其使用.练习使用private;

/**
 * 对于基本类型当中的boolean值，GEtter方法一样要写出isXxx形式
 * SetXxx不变
 */
public class Student {

    private String name;
    private int age;
    private boolean male;//判断谁不是男的

    public void setMale (boolean b){
        male  = b;
    }
    public boolean isMale (){
        return male;
    }

    public void setName (String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
}
