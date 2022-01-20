package com.company.basics;
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
class Employee{
    int id;
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }


}
class cellphone{
    public void ringing ()
    {
        System.out.println("ringing....");
    }
    public void vibrating()
    {
        System.out.println("vibrating....");
    }
    public void calling()
    {
        System.out.println("calling rajeev...");
    }
}

class square{
    int side;
    public int area()
    {
        return  side*side;
    }
    public int parameter()
    {
        return 4*side;
    }
}

class MyEmployee{
    private int id;
    private String name;
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
}
class MyMainEmployee{
    private int id;
    private String name ;
    private int salary;

//    public MyMainEmployee()
//    {
//        id=101;
//        name = "Roshan";
//    }
    public   MyMainEmployee(int id,String name)
    {
        this.id=id;
        this.name= name;
    }
    public MyMainEmployee(int id , String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }
}

public class oops {
    public static void main(String ar[])
    {
//        System.out.println("This is our custom class");
//        Employee obj1 = new Employee(); //Instantiating a new Employee object
//
//        // setting Attributes
//        obj1.id=12;
//        obj1.name="Roshan Sharma";
//        obj1.salary=15000;
//        Employee obj2 = new Employee();
//        obj2.id=13;
//        obj2.name="Rajeev";
//        obj2.salary=50000;
//        //printing the Attributes
//        obj1.printDetails();
//        System.out.println(obj1.getSalary());
//        obj2.printDetails();
//        System.out.println(obj2.getSalary());
//         System.out.println(obj1.id);
//         System.out.println(obj1.name);

//        Employee obj1 = new Employee();
//        obj1.id=101;
//        obj1.salary=15000;
//        obj1.setName("Roshan sharma");
//        System.out.println(obj1.getSalary());
//        System.out.println(obj1.getName());

//        cellphone iphone = new cellphone();
//        iphone.ringing();
//        iphone.vibrating();
//        iphone.calling();

//        square five = new square();
//        five.side=5;
//        System.out.println(five.area());
//        System.out.println(five.parameter());
        //MyEmployee obj1 = new MyEmployee();
        //obj1.id=101;
        //obj1.name="Roshan";
//        obj1.setId(101);
//        obj1.setName("Roshan");
//        System.out.println(obj1.getId());
//        System.out.println(obj1.getName());
        MyMainEmployee obj1 = new MyMainEmployee(101,"Roshan");
        MyMainEmployee obj2 = new MyMainEmployee(102,"Rajeev",15000);
        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());
        System.out.println(obj2.getSalary());


    }
}
