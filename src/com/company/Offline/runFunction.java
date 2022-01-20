package com.company.Offline;

class th2 extends Thread{
    public void run()
    {
        int i;
        for (i=50;i<=100;i++)
        {
            System.out.println("Thread 2 "+ i);
        }
    }
}
public class runFunction extends Thread {
    public void run()
    {
        int i;
        for (i=1; i<=50;i++)
        {
            System.out.println("Thread: 1 " + i);
        }

    }
    public static void main(String ar[])
    {
        runFunction t1 = new runFunction();

        th2 t2 = new th2();
        t2.setPriority(4);
        t2.run();
        t1.run();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(8);
        System.out.println(t1.getPriority());
        System.out.println(t1.getName());
        System.out.println(t2.getName());


    }
}
