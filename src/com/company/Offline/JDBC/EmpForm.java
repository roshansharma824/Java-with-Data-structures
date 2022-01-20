package com.company.Offline.JDBC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpForm implements ActionListener {

    static Frame frm;
    static Label lblId;
    static Label lblName;
    static Label lblSal;
    static Label lblPh;

    static TextField txtId;
    static TextField txtName;
    static TextField txtSal;
    static TextField txtPh;

    static Button btnAdd;
    static Button btnDel;
    static Button btnUp;
    static Button btnSr;
    static Button btnExt;


    public static void main(String[] args) {
        EmpForm ef = new EmpForm();

        frm = new Frame("Employee");

        lblId = new Label("Id");
        lblName = new Label("Name");
        lblSal = new Label("Salary");
        lblPh  = new Label("Phone");

        txtId = new TextField(10);
        txtName = new TextField(10);
        txtSal = new TextField(10);
        txtPh = new TextField(10);

        btnAdd = new Button("Add");
        btnDel = new Button("Delete");
        btnUp = new Button("Update");
        btnSr = new Button("Search");
        btnExt  = new Button("Exit");

        frm.setVisible(true);
        frm.setSize(200,400);

        frm.setLayout( new FlowLayout());

//        lblId.setBounds(10,10,10,10);
//        lblName.setBounds(10,10,10,10);
//        lblSal.setBounds(10,10,10,10);
//        lblPh.setBounds(10,10,10,10);
//
//        txtId.setBounds(10,10,10,10);
//        txtName.setBounds(10,10,10,10);
//        txtSal.setBounds(10,10,10,10);
//        txtPh.setBounds(10,10,10,10);
//
//        btnAdd.setBounds(10,10,10,10);
//        btnDel.setBounds(10,10,10,10);
//        btnUp.setBounds(10,10,10,10);
//        btnSr.setBounds(10,10,10,10);
//
//        btnExt.setBounds(10,10,10,10);

        frm.add(lblId);
        frm.add(txtId);

        frm.add(lblName);
        frm.add(txtName);

        frm.add(lblSal);
        frm.add(txtSal);

        frm.add(lblPh);
        frm.add(txtPh);

        frm.add(btnAdd);
        frm.add(btnDel);
        frm.add(btnUp);
        frm.add(btnSr);

        frm.add(btnExt);

        btnAdd.addActionListener(ef);
        btnDel.addActionListener(ef);
        btnUp.addActionListener(ef);
        btnSr.addActionListener(ef);

        btnExt.addActionListener(ef);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Button b = (Button) e.getSource();

        if (b == btnAdd){
            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
                Statement stmt = conn.createStatement();

                String id = txtId.getText();
                String nm = txtName.getText();
                String sal = txtSal.getText();
                String ph = txtPh.getText();

                int a = stmt.executeUpdate("insert into Emp values('"+id+"', '"+nm+"', '"+ph+"','"+sal+"') ");


            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Error hai");
            }
        }
        else if (b == btnDel){

            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
                Statement stmt = conn.createStatement();

                String id = txtId.getText();

                int a = stmt.executeUpdate("delete from Emp where id = '"+id+"' ");

            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Error hai");
            }

        }
        else if (b == btnUp){

            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
                Statement stmt = conn.createStatement();

                String id1 = txtId.getText();
                String nm1 = txtName.getText();
                String sal1 = txtSal.getText();
                String ph1 = txtPh.getText();

                int a = stmt.executeUpdate("update Emp set  name='"+nm1+"', ph='"+ph1+"', sal='"+sal1+"' where id='"+id1+"' ");


            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Error hai");
            }

        }
        else if (b == btnSr){


            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
                Statement stmt = conn.createStatement();

                String id = txtId.getText();


                ResultSet rs = stmt.executeQuery("select *from Emp where id='"+id+"' ");

                while (rs.next()){

                    txtId.setText(rs.getString(1));
                    txtName.setText(rs.getString(2));
                    txtSal.setText(rs.getString(4));
                    txtPh.setText(rs.getString(3));

                }


            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Error hai");
            }

        }

    }
}
