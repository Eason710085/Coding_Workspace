package GUI;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,500,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        JLabel l = new JLabel("展示图片的标签");


        Icon icon = new ImageIcon("src/GUI/Picture.png");//获取相应路径下的图片文件
        l.setIcon(icon);//添加图片
        //l.setSize(20,20);//设定标签大小，即使设置标签大小，也不会改变图片大小
        c.add(l);
        setVisible(true);
    }

    public static void main(String[] args) {
        //new Demo();
        Demo demo = new Demo();
    }
}