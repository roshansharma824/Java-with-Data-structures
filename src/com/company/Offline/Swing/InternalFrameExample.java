package com.company.Offline.Swing;

// java Program to create a simple JInternalFrame
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class InternalFrameExample extends JFrame {

    // frame
    static JFrame f;

    // label to display text
    static JLabel l;

    // main class
    public static void main(String[] args)
    {
        // create a new frame to
        f = new JFrame("frame");

        // create a internal frame
        JInternalFrame in = new JInternalFrame();

        // set the title of the frame
        in.setTitle("InternalFrame");

        // create a Button
        JButton b = new JButton("button");
        JButton b2 = new JButton("button");
        // create a label to display text
        l = new JLabel("This is a JInternal Frame ");

        // create a panel
        JPanel p = new JPanel();

        // add label and button to panel
        p.add(l);
        p.add(b);
        p.add(b2);

        // set visibility internal frame
        in.setVisible(true);

        // add panel to internal frame
        in.add(p);
//        f.add(b2);
        // add internal frame to frame
        f.add(in);

        // set the size of frame
        f.setSize(300, 300);

        f.setVisible(true);
    }
}
