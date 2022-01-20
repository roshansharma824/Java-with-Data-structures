package com.company.Offline;


import java.awt.*;
import java.awt.event.*;
class MyLoginWindow extends Frame {
        TextField name, pass, rePass;
        Button b1, b2;

        MyLoginWindow() {
            setLayout(new FlowLayout());
            this.setLayout(null);
            Label n = new Label("Name:", Label.CENTER);
            Label p = new Label("Password:", Label.CENTER);
            Label rp = new Label("Re-password:", Label.CENTER);
            CheckboxGroup cbg1 = new CheckboxGroup();
            Checkbox cb1=new Checkbox ("M", cbg1, false);
            Checkbox cb2=new Checkbox ("F", cbg1, false);
            Checkbox cb3=new Checkbox ("Other", cbg1, false);
            name = new TextField(20);
            pass = new TextField(20);
            rePass = new TextField(20);
            pass.setEchoChar('*');
            b1 = new Button("submit");
            b2 = new Button("cancel");
            this.add(n);
            this.add(name);
            this.add(p);
            this.add(pass);
            this.add(rp);
            this.add(rePass);
            this.add(b1);
            this.add(b2);
            this.add(cb1);
            this.add (cb2);
            this.add (cb3);
            n.setBounds(70, 90, 90, 60);
            p.setBounds(70, 130, 90, 60);
            rp.setBounds(70, 170, 90, 60);
            name.setBounds(200, 100, 90, 20);
            pass.setBounds(200, 140, 90, 20);
            rePass.setBounds(200,180,90,20);
            b1.setBounds(200, 260, 70, 40);
            b2.setBounds(280, 260, 70, 40);
//            cb1.setBounds();

        }

        public static void main(String args[]) {
            MyLoginWindow ml = new MyLoginWindow();
            ml.setVisible(true);
            ml.setSize(400, 400);
            ml.setTitle("my login window");

        }
}

