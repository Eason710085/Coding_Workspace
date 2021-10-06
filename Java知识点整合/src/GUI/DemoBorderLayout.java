package GUI;

import javax.swing.*;
import java.awt.*;

public class DemoBorderLayout extends JFrame {
    public DemoBorderLayout(){
        setBounds(100,100,350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());//设置边界布局

        JButton b1 = new JButton("中");
        JButton b2 = new JButton("东");
        JButton b3 = new JButton("西");
        JButton b4 = new JButton("南");
        JButton b5 = new JButton("北");

        c.add(b1,BorderLayout.CENTER);
        c.add(b2,BorderLayout.EAST);
        c.add(b3,BorderLayout.WEST);
        c.add(b4,BorderLayout.SOUTH);
        c.add(b5,BorderLayout.NORTH);

        //覆盖组建
        c.add(new JButton("覆盖"),BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoBorderLayout();
    }
}