package GUI;

import javax.swing.*;
import java.awt.*;

public class DemoJTextArea extends JFrame {
    public DemoJTextArea(){
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());//设置成流布局

        JTextArea area = new JTextArea();
        area.setText("这是文本域");
        area.setRows(5);//设定长
        area.setColumns(10);//设定宽
        area.append("添加内容");//不覆写进行添加内容append
        area.insert("插入",2);//在第二列插入
        area.setFont(new Font("楷体",Font.PLAIN,22));

        JScrollPane js = new JScrollPane(area);//给文本域添加滚动条

        c.add(js);

        setVisible(true);

    }

    public static void main(String[] args) {
        new DemoJTextArea();
    }
}