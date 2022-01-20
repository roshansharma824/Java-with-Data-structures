package com.company.basics;
import java.awt.*;
public class awt1 {
    public static void main(String ar[])
    {
        Frame frm = new Frame("DEMO");
        Button btn = new Button("+");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        Label lbl = new Label();
        frm.setVisible(true);
        frm.setLayout(new FlowLayout());
        frm.add(tf1);
        frm.add(btn);
        frm.add(tf2);
        frm.add(lbl);
        frm.add(tf3);


    }
}
