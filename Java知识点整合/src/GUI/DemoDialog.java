package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoDialog extends JDialog {
    public DemoDialog(Frame frame){
        /**
         * 第一个参数为父窗体对象
         * 第二个参数为对话框标题
         * 第三个参数为是否阻塞父窗体
         */
        super (frame,"对话框标题",true);
        Container c = getContentPane();//获取窗体容器
        c.add(new JLabel("这是一个对话框"));
        setVisible(true);
        setBounds(100,100,100,100);//设置窗体坐标和大小

    }



    public static void main(String[] args) {
        JFrame f = new JFrame("父窗体");
        f.setBounds(500, 500, 300, 300);
        Container c = f.getContentPane();
        JButton btn = new JButton("弹出对话框");
        c.setLayout(new FlowLayout());//设置布局：使用流布局
        c.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DemoDialog(f);
            }
        });
    }
}
