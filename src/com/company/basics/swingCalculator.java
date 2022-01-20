package com.company.basics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swingCalculator implements ActionListener {
    static JFrame frm = null;
    static JTextField tf1 = null;
    static JTextField tf2 = null;
    static JTextField tf3 = null;
    static JButton btn = null;
    static JLabel lbl= null;

    public static void main(String ar[])
    {
        swingCalculator obj1 = new swingCalculator();
        frm = new JFrame("sum");
        tf1 = new JTextField(2);
        tf2 = new JTextField(2);
        tf3 = new JTextField(2);
        btn = new JButton("+");
        lbl = new JLabel("=");
        frm.setVisible(true);
        frm.setLayout(new FlowLayout());
        frm.add(tf1);
        frm.add(btn);
        frm.add(tf2);
        frm.add(lbl);
        frm.add(tf3);
        btn.addActionListener(obj1);
    }
    public void actionPerformed(ActionEvent a)
    {
        String s1 = tf1.getText().trim();
        String s2 = tf2.getText().trim();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = n1+n2;
        String s3 = String.valueOf(n3);
        tf3.setText(s3);
    }

}

