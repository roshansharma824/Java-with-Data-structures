package com.company.basics;
import java.awt.*;
import java.awt.event.*;
public class guicalculator implements ActionListener{
    static Frame frm = null;
    static TextField tf1 = null;
    static TextField tf2 = null;
    static TextField tf3 = null;
    static Button btn = null;
    static Label lbl = null;


    public static void main(String ar[])
    {
        guicalculator obj1 = new guicalculator();
        frm = new Frame("Sum");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        btn = new Button("+");
        lbl = new Label("=");
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
