package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJList extends JFrame {
    public DemoJList(){
        setBounds(100,100,200,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        String items []= {"1","2","3","4","5","6","7","8",};
        JList <String> j1 = new JList<>(items);

        DefaultListModel<String> model = new DefaultListModel<>();
        for(String tmp:items){
            model.addElement(tmp);//向数据模型添加元素
        }
        JList <String>  jl = new JList<>();
        model.addElement("添加新元素");//数据模型，添加新元素
        j1.setModel(model);

        /**
         * SINGLE_SELECTION 单选模式
         * SINGLE_INTERVAL_SELECTION只能连续选择相邻的元素
         * MULTIPLE_INTERVAL_SELECTION多选
         */
        //j1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //j1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        j1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane js = new JScrollPane(j1);//为列表框添加滚动条
        js.setBounds(10,10,100,100);
        c.add(js);

        //确认选择的值
        JButton btn = new JButton("确认");
        btn.setBounds(120,90,70,25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //获取列表框中选中的所有的元素
                java.util.List<String> values= jl.getSelectedValuesList();
                for (String tmp:values) {
                    System.out.println(tmp);
                }
                System.out.println("-----end-----");
            }
        });
        c.add(btn);

        setVisible(true);

    }

    public static void main(String[] args) {
        new DemoJList();
    }

}