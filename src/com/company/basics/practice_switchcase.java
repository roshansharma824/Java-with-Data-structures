package com.company.basics;
import java.util.Scanner;
public class practice_switchcase {
    public static void main(String ar[])
    {
        //Question 2
//        byte s1,s2,s3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your phyicis marks");
//        s1 = sc.nextByte();
//        System.out.println("Enter your chamistri marks");
//        s2 = sc.nextByte();
//        System.out.println("Enter your maths marks");
//        s3 = sc.nextByte();
//        float avg = (s1+s2+s3)/3.0f;
//        System.out.println("your overall parcentage is : "+avg);
//        if(avg>40 && s1>=33 && s2>=33 && s3>=33)
//        {
//            System.out.println("you are passed");
//        }
//        else
//        {
//            System.out.println("you are failed");
//        }

        // Question 3
//        int e,t;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your salary");
//        e = sc.nextInt();
//        if(e<=250000)
//        {
//            System.out.println("There is no tax ");
//        }
//        else if(e>250000 && e<=500000)
//        {
//            t=(e*5)/100;
//            System.out.println("You have to pay tax : "+t);
//        }
//        else if(e>500000 && e<=1000000)
//        {
//            t = (e*20)/100;
//            System.out.println("You have to pay tax : "+t);
//        }
//        else
//        {
//            t = (e*30)/100;
//            System.out.println("You have to pay tax : "+t);
//        }

        // Question 4
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number");
        d = sc.nextInt();
        switch(d)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Envalid number");
        }


    }
}
