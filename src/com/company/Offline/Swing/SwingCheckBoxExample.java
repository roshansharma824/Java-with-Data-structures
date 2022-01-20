package com.company.Offline.Swing;

import javax.swing.*;

public class SwingCheckBoxExample {
    SwingCheckBoxExample(){
        JFrame f = new JFrame("CheckBox Example");
        JCheckBox cb3 = new JCheckBox("C");
        JCheckBox cb1 = new JCheckBox("C++");
        JCheckBox cb2 = new JCheckBox("Java",true);
        JCheckBox cb4 = new JCheckBox("Python");
        cb1.setBounds(100,100,50,50);
        cb2.setBounds(100,150,100,50);
        cb3.setBounds(100,200,100,50);
        cb4.setBounds(100,300,100,50);


        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);

        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,500);

    }

    public static void main(String[] args) {
        new SwingCheckBoxExample();
    }
}
