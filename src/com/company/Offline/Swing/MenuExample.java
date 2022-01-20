package com.company.Offline.Swing;
import javax.swing.*;
public class MenuExample
{
    MenuExample(){
        JFrame f = new JFrame("Menu Example");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu subMenu = new JMenu("sub menu");

        JMenuItem i1 = new JMenuItem("Item 1");
        JMenuItem i2 = new JMenuItem("Item 2");
        JMenuItem i3 = new JMenuItem("Item 3");
        JMenuItem i4 = new JMenuItem("Item 4");
        JMenuItem i5 = new JMenuItem("Item 5");
        JMenuItem i6 = new JMenuItem("Item 6");
        JMenuItem i7 = new JMenuItem("Item 7");

        menu.add(i1); menu.add(i2); menu.add(i3); menu.add(i4); menu.add(i5);
        subMenu.add(i6); subMenu.add(i7);

        menu.add(subMenu);
        menuBar.add(menu);

        f.setJMenuBar(menuBar);
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(null);


    }

    public static void main(String[] args) {
        new MenuExample();
    }























//    JMenu menu, submenu;
//    JMenuItem i1, i2, i3, i4, i5;
//    MenuExample(){
//        JFrame f= new JFrame("Menu and MenuItem Example");
//        JMenuBar mb=new JMenuBar();
//        menu=new JMenu("Menu");
//        submenu=new JMenu("Sub Menu");
//        i1=new JMenuItem("Item 1");
//        i2=new JMenuItem("Item 2");
//        i3=new JMenuItem("Item 3");
//        i4=new JMenuItem("Item 4");
//        i5=new JMenuItem("Item 5");
//        menu.add(i1); menu.add(i2); menu.add(i3);
//        submenu.add(i4); submenu.add(i5);
//        menu.add(submenu);
//        mb.add(menu);
//        f.setJMenuBar(mb);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//    public static void main(String args[])
//    {
//        new MenuExample();
//    }
}
