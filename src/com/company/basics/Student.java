package com.company.basics;

class student1
{
    int rollNumber;
    String name;
    static int numStudent;


    public student1(int r,String n)
    {
        this.rollNumber=r;
        this.name=n;
        numStudent++;
    }
    public void print1()
    {
        System.out.println("Roll Number "+rollNumber);
        System.out.println("Name "+name);
    }
//    public static int getRollnumber()
//    {
//        return rollNumber;
//    }

}

public class Student {

    public  static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        student1 s1 = new student1(101,"Roshan");
        student1 s3 = new student1(101,"Roshan");
        student1 s4 = new student1(101,"Roshan");
        student1 s5 = new student1(101,"Roshan");
        s1.print1();
        student1 s2 = new student1(102,"Rajeev");
        s2.print1();
        System.out.println(s1.rollNumber);
        System.out.println(s1.numStudent);
        System.out.println(s2.numStudent);
        System.out.println(student1.numStudent);



    }
}
