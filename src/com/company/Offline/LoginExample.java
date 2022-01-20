package com.company.Offline;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ScheduledExecutorService;

public class LoginExample implements ActionListener {
    static Frame frm = null;
    static Label name = null;
    static TextField nameInput = null;
    static Label password = null;
    static TextField passwordInput = null;
    static Label re_password = null;
    static TextField re_passwordInput = null;

    static CheckboxGroup cbg1 = null;
    static Checkbox male = null;
    static Checkbox female = null;
    static Checkbox other = null;

    static CheckboxGroup cbg2 = null;
    static Checkbox grad = null;
    static Checkbox pg = null;
    static Checkbox ug = null;

    static Checkbox reading = null;
    static Checkbox playing = null;

    static List skill = null;

    static Button add = null;
    static Button display = null;


    public static void main(String[] args) {
        LoginExample l = new LoginExample();
        frm = new Frame("Login");

        name = new Label("Name");
        nameInput =  new TextField();

        password = new Label("Password");
        passwordInput = new TextField();

        re_password = new Label("Re-Password");
        re_passwordInput = new TextField();

        frm.setVisible(true);
        frm.add(name);
        frm.add(nameInput);
        frm.add(password);
        frm.add(re_password);
        frm.add(re_passwordInput);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
