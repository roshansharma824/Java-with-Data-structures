package com.company.basics;
import java.util.Scanner;
public class parcentageCalulator {
    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr your 5 subjects marks out of 100 ");
        System.out.println("Enter your first subject marks");
        int a = s.nextInt();
        System.out.println("Enter your second subject marks");
        int b = s.nextInt();
        System.out.println("Enter your third subject marks");
        int c = s.nextInt();
        System.out.println("Enter your fourth subject marks");
        int d = s.nextInt();
        System.out.println("Enter your fivth subject marks");
        int e = s.nextInt();
        float f = (((a+b+c+d+e)/500.0f)*100);
        System.out.println("parcentage of marks is : "+f);



    }
}
