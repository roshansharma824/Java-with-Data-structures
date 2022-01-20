package com.company.Offline.Swing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample2 extends JFrame implements ActionListener {

    static JFrame f;

    static JDialog d, d1;

    public static void main(String[] args) {

        f = new JFrame("Frame");

        DialogExample2 obj = new DialogExample2();

        JPanel p = new JPanel();

        JButton b = new JButton("Click");

        b.addActionListener(obj);

        p.add(b);
        f.add(p);

        f.setSize(400,400);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Click")){
            d = new JDialog(f,"dialog box");

            JLabel l = new JLabel("this is first dialog box");

            JButton b = new JButton("click me");

            b.addActionListener(this);

            JPanel p = new JPanel();

            p.add(b);
            p.add(l);

            d.add(p);

            d.setSize(200,200);

            d.setVisible(true);
        }
        else {
            d1 = new JDialog(d,"dialog Box");

            JLabel l = new JLabel("this is second dialog box ");

            d1.add(l);

            d1.setSize(200,200);
            d1.setLocation(200,200);

            d1.setVisible(true);
        }
    }
}
