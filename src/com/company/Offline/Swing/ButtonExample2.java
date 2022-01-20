package com.company.Offline.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample2  {

    ButtonExample2(){
        JFrame frm = new  JFrame("Enable Disable Button");
        JTextField tf = new JTextField(4);
        JButton btn = new JButton("Add");
        JButton btn2 = new JButton("Cancel");

        frm.setVisible(true);
        frm.setLayout(new FlowLayout());
        frm.setSize(400,400);
        frm.add(tf);
        frm.add(btn);
        frm.add(btn2);
        btn2.setVisible(false);

        btn.addActionListener (e -> btn2.setVisible(true));

        btn2.addActionListener (e -> {
            btn2.setVisible(false);
            tf.setText("");
        });


    }

    public static void main(String[] args) {
        new ButtonExample2();

    }

}
