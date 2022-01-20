package com.company.Offline.Swing;

import javax.swing.*;
import java.awt.event.*;

public class MenuExample2 implements ActionListener {
    JFrame f;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;
    JMenuBar menuBar;
    JMenu file,edit,help;


    MenuExample2(){
        f = new JFrame("Menu exmaple");
        ta = new JTextArea();
        ta.setBounds(5,5,360,320);

        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        f.add(menuBar);
        f.setJMenuBar(menuBar);
        f.add(ta);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);




    }



    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut)
            ta.cut();
        if(e.getSource()==paste)
            ta.paste();
        if(e.getSource()==copy)
            ta.copy();
        if(e.getSource()==selectAll)
            ta.selectAll();
    }


    public static void main(String[] args) {
        new MenuExample2();


//        JScrollPane sp = new JScrollPane();
    }


}


//public class MenuExample2 implements ActionListener{
//    JFrame f;
//    JMenuBar mb;
//    JMenu file,edit,help;
//    JMenuItem cut,copy,paste,selectAll;
//    JTextArea ta;
//    MenuExample2(){
//        f=new JFrame();
//        cut=new JMenuItem("cut");
//        copy=new JMenuItem("copy");
//        paste=new JMenuItem("paste");
//        selectAll=new JMenuItem("selectAll");
//        cut.addActionListener(this);
//        copy.addActionListener(this);
//        paste.addActionListener(this);
//        selectAll.addActionListener(this);
//        mb=new JMenuBar();
//        file=new JMenu("File");
//        edit=new JMenu("Edit");
//        help=new JMenu("Help");
//        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
//        mb.add(file);mb.add(edit);mb.add(help);
//        ta=new JTextArea();
//        ta.setBounds(5,5,360,320);
//        f.add(mb);f.add(ta);
//        f.setJMenuBar(mb);
//        f.setLayout(null);
//        f.setSize(400,400);
//        f.setVisible(true);
//    }
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==cut)
//            ta.cut();
//        if(e.getSource()==paste)
//            ta.paste();
//        if(e.getSource()==copy)
//            ta.copy();
//        if(e.getSource()==selectAll)
//            ta.selectAll();
//    }
//    public static void main(String[] args) {
//        new MenuExample2();
//    }
//}


