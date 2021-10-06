package GUI;

import sun.jvm.hotspot.debugger.Address;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 extends JFrame {
    public Demo1(){
        JFrame f = new JFrame("Address Book");
        f.setBounds(600,300,380,350);


        Container c = getContentPane();
        setTitle("Address Book");

        f.setLayout(null);
        JLabel Menu = new JLabel("Menu");
        Menu.setFont(new Font("Arial", Font.BOLD,15));
        Menu.setBounds(170,30,300,30);

        JButton b1 = new JButton("Add a person"), b2 = new JButton("Delete a person"),
                b3 = new JButton("Modify a person"),b4 = new JButton("Print one person"),
                b5 = new JButton("Print all person"),b6 = new JButton("Write all elements to the text file"),
                b7 = new JButton("BONUS OPTION"), b8 = new JButton("Exit");
        b1.setBounds(40,60,300,30);
        b2.setBounds(40,90,300,30);
        b3.setBounds(40,120,300,30);
        b4.setBounds(40,150,300,30);
        b5.setBounds(40,180,300,30);
        b6.setBounds(40,210,300,30);
        b7.setBounds(40,240,300,30);
        b8.setBounds(40,270,300,30);
        f.add(Menu);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);


        f.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo1();
    }

    public static void addPerson(){
        JFrame newJFrame = new JFrame("Add Person");
        newJFrame.setBounds(600,300,380,350);


    }
}
