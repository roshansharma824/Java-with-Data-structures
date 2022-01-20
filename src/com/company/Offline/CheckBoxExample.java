package com.company.Offline;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CheckBoxExample implements ActionListener {
    static Frame frm = null;
    static Checkbox cb1 = null;
    static Checkbox cb2 = null;
    static Checkbox cb3 = null;
    static Button btn = null;

    public static void main(String[] args) {
        CheckBoxExample c = new CheckBoxExample();
        WindowListener wl = new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void  windowClosing(WindowEvent e) {
                System.out.println("Closing");
                e.getWindow().dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        };
        frm = new Frame( "Select the courses");
        cb1 = new Checkbox("C lang");
        cb2 = new Checkbox("C++");
        cb3 = new Checkbox("Java");
        btn = new Button("OK");


        frm.setVisible(true);
        frm.setLayout(null);

        cb1.setBounds(50,50,50,50);
        cb2.setBounds(50,100,50,50);
        cb3.setBounds(50,150,50,50);
        btn.setBounds(50,250,100,50);

        frm.add(cb1);
        frm.add(cb2);
        frm.add(cb3);
        frm.add(btn);

        btn.addActionListener(c);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
