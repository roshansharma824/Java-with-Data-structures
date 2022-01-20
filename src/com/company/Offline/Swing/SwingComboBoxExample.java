package com.company.Offline.Swing;

import javax.swing.*;

public class SwingComboBoxExample {
    SwingComboBoxExample(){
        JFrame f = new JFrame("CheckBox Example");
        String country[] = {"India","Aus","USA","England","Newzealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,500);

    }

    public static void main(String[] args) {
        new SwingComboBoxExample();
    }
}
