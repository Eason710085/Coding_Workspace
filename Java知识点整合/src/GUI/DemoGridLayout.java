package GUI;

import javax.swing.*;
import java.awt.*;

public class DemoGridLayout extends JFrame {
    public DemoGridLayout(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,5,5,5));

        for (int i = 0; i < 20; i++) {
            c.add(new JButton("按钮"+i));
        }



        setVisible(true);

    }

    public static void main(String[] args) {
        new DemoGridLayout();
    }
}
