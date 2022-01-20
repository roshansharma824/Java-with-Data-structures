package com.company.basics;

import java.util.Scanner;
//class Employee{
//    int id;
//    String name;
//    int salary ;
//
//    public void printDetails()
//    {
//
//        System.out.println("My id is "+id);
//        System.out.println("My name is "+name);
//    }
//    public int getSalary()
//    {
//        return salary;
//    }
//}

//public class Main {
//    public static void nuturalNo(int n)
//    {
//        if(n==0)
//        {
//            return  ;
//        }
//         nuturalNo(n-1);
//        System.out.print(n+" ");
//
//    }
//    public static int numberOfDigit(int n)
//    {
//        if (n/10==0)
//        {
//            return 1;
//        }
//        return 1+ numberOfDigit(n/10);
//
//    }
//
//     public static void main(String ar[])
//     {
//         nuturalNo(5);
//         System.out.println("new line");
//         System.out.println(numberOfDigit(1253));
////         System.out.println("This is our custom class");
////         Employee obj1 = new Employee(); //Instantiating a new Employee object
////
////         // setting Attributes
////         obj1.id=12;
////         obj1.name="Roshan Sharma";
////         obj1.salary=15000;
////         Employee obj2 = new Employee();
////         obj2.id=13;
////         obj2.name="Rajeev";
////         obj2.salary=50000;
////         //printing the Attributes
////         obj1.printDetails();
////         System.out.println(obj1.getSalary());
////         obj2.printDetails();
////         System.out.println(obj2.getSalary());
//////         System.out.println(obj1.id);
//////         System.out.println(obj1.name);
//     }
//
//}
//class Vehicle {
//    public void Print() {
//        System.out.print("Vehicle's Print() ");
//    }
//}
//
//class FourWheelers extends Vehicle {
//    public void Print() {
//        System.out.print("FourWheelers's Print() ");
//    }
//}
//
//class Car extends FourWheelers {
//    public void Print() {
//        super.Print();
//        System.out.print("Car's Print()");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.Print();
//    }
//}
class A{
    public static void A(){
        System.out.print("Good ");
        throw new RuntimeException();
    }
    public static void B(){
        A();
        System.out.print("This ");
    }
    public static void main(String[] args){
        try{
            B();
        }
        catch(Exception e){
            System.out.print("Time ");
        }
        finally{
            System.out.print("at CodingNinjas");
        }
    }
}



