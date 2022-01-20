package com.company.Offline;

import java.awt.*;
import java.awt.event.*;
public class ChooiceBox implements ActionListener{
    static Frame frm = null;
    static Button btn1 = null;
    static TextField tf1 = null;
    static Choice cb = null;

    static Button btn2 = null;


    public static void main(String[] args) {
        ChooiceBox dl = new ChooiceBox();
        frm = new Frame("List eg");
        tf1 = new TextField();
        btn1 = new Button("ADD");
        btn2 = new Button("Delete");
        cb = new Choice();
        frm.setVisible(true);
        frm.setLayout(null);
        cb.setBounds(50,50,200,250);
        tf1.setBounds(350,50,100,50);
        btn1.setBounds(350,150,100,50);
        btn2.setBounds(350,250,100,50);

        frm.add(cb);
        frm.add(tf1);
        frm.add(btn1);
        frm.add(btn2);
        btn1.addActionListener(dl);
        btn2.addActionListener(dl);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn = (Button)e.getSource();
        if (btn == btn1) {
            String s = tf1.getText();
            cb.add(s);
        }

        else
        {
            cb.remove(cb.getSelectedItem());
        }
    }
}
