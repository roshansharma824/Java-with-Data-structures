package com.company.Offline.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample1 implements ActionListener {
    static JFrame frm = null;
    static JTextField tf1 = null;
    static JButton btn = null;
    static JTextField tf2 = null;
    static JLabel lbl = null;
    static JTextField tf3 = null;


    public static void main(String[] args) {
        SwingExample1 obj1 = new SwingExample1();
        frm = new  JFrame("Addition");
        tf1 = new JTextField(5);
        btn = new JButton("+");
        tf2 =new JTextField(5);
        lbl = new JLabel("=");
        tf3 =new JTextField(5);

        Icon i = new ImageIcon("D:\\java8.png");
        JButton b = new JButton(i);

        frm.setVisible(true);
        frm.setLayout(new FlowLayout());
        frm.setSize(400,400);
        frm.add(lbl);
        frm.add(tf1);
        frm.add(btn);
        frm.add(tf2);
        frm.add(lbl);
        frm.add(tf3);
        frm.add(b);
        btn.addActionListener(obj1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText().trim();
        String s2 = tf2.getText().trim();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = n1+n2;
        String s3 = String.valueOf(n3);

        tf3.setText(s3);


    }
}
