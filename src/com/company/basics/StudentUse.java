package com.company.basics;

class Student3{
     String name;
     int rollNo;
    Student3(int num){
        rollNo = num;
    }
    public void print(){
        System.out.print(name +" " + rollNo+" ");
    }
}

public class StudentUse {
    public static void main(String[] args) {
        Student3 s = new Student3(101);
        s.rollNo = 15;
        s.print();
    }
}
