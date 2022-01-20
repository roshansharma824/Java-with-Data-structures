package com.company.Offline.Swing;

import javax.swing.*;

public class TableExample {
    JFrame f;
    TableExample(){
        f = new JFrame();
        String data[][] = {
                {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"103","Sachin","70000"}
        };
        String coloum[] = {"ID","NAME","SALARY"};
        JTable jt = new JTable(data,coloum);
        jt.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
