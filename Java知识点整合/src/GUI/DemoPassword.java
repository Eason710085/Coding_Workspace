package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoPassword extends JFrame {
    public DemoPassword(){
        setBounds(100,100,300,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JPasswordField jp = new JPasswordField();
        jp.setColumns(10);
        jp.setFont(new Font("Arial",Font.BOLD,20));//设置字体
        jp.setEchoChar('#');//设置回显字符
        c.add(jp);

        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char ch [] =jp.getPassword();//获取密码的字符数组
                String str = new String (ch);
                System.out.println(str);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoPassword();
    }
}
