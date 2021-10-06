package GUI;

import javax.swing.*;
import java.awt.*;

public class DemoLabel extends JFrame {
    public DemoLabel(){
        setBounds(100,100,200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c =getContentPane();
        setVisible(true);


        JLabel l = new JLabel("这是一个标签");
        //l.setText("更改标签内容");
        //System.out.println(l.getText());
        c.add(l);
        l.setFont(new Font("微软雅黑", Font.BOLD,15));
        l.setForeground(Color.RED);
    }

    public static void main(String[] args) {
        new DemoLabel();
    }
}
