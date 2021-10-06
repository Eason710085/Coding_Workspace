package GUI;

import javax.swing.*;
import java.awt.*;

public class DemoFrame extends JFrame {

    public DemoFrame(){

        setVisible(true);
        setTitle("窗体标题");
        //窗体关闭规则
        //关闭窗口
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //无任何操作
        //f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //隐藏窗体，但是不停止程序
        //f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //释放窗体资源
        //f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //f.setSize(300,200);//设置大小
        //f.setLocation(300,300);//设置左边
        setBounds(200,300,300,300);

        Container c = getContentPane();//获得窗体容器
        c.setBackground(Color.WHITE);//设置颜色
        JLabel l = new JLabel("这是一个窗体");
        c.add(l);
        //c.remove(l);//删除组建
        c.validate();//验证容器中的组建
        //f.setContentPane(c);//让窗体重新载入容器，一般使用validate


        setResizable(false);//设置窗体是否可以改变大小
        System.out.println("x=" +getX()+"Y="+getY());
    }
    public static void main(String[] args) {
        new DemoFrame();
    }
}
