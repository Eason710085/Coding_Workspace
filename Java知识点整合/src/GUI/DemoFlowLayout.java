package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * 流布局
 */
public class DemoFlowLayout extends JFrame {
    public DemoFlowLayout(){
        setBounds(100,100,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));//给容器设置流布局，左对齐


        for (int i = 0; i < 10; i++) {
            c.add(new JButton("按钮"+i));//循环添加按钮
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoFlowLayout();
    }
}

