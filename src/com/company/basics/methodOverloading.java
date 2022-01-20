package com.company.basics;

public class methodOverloading {
    static void foo()
    {
        System.out.println("Good moring bro!");
    }

    static void foo(int a)
    {
        System.out.println("Good moring "+a+" bro!");
    }

    static void change1(int a)
    {
        a=50;
    }
    static void change2(int arr[])
    {
        arr[0]=62;
    }
    static void telljoke()
    {
        System.out.println("I invented a new world\n"+"Plagiarism");
    }
    public static void main(String ar[])
    {
           //telljoke();
        // case 1
//        int x=25;
//        change1(x);
//        System.out.println(x);

        // case 1  change the Array
//        int marks[] = {52,64,70,98,58,60};
//        change2(marks);
//        System.out.println(marks[0]);

        //Method Overloading
        foo();
        foo(3000);


    }
}
