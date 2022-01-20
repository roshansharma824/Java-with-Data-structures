package com.company.basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class strings {
    private static String Reverse(String str) {
        char charArray[] = str.toCharArray();
        for (int i = 0; i <str.length(); i++){
            if(charArray[i] == ' ')
                return Reverse(str.substring(i + 1)) + str.substring(0, i) + " ";
        }

        return str + " ";
    }

    public static void main(String ar[])
    {
        String s="welcome to coding ninja";
        System.out.println(Reverse(s));
       //String name = new String("Harry");
//        String name = "jarry";
//        System.out.println(name);

//        int a=6;
//        float b=5.63784f;
//        System.out.printf("The value of a is %d the value of b is %f",a,b);

//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println(st);

        //String name = "Roshan";
//        int V=name.length();
////        String name1;
////        name1=name.toLowerCase();
//        System.out.println(V);
//        String name2;
//        name2=name.toUpperCase();
//        System.out.println(name2);
//        System.out.println(name1);
//
//        String nonTrimmedString = "    Roshan     ";
//        System.out.println(nonTrimmedString);
//        System.out.println(nonTrimmedString.trim());
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(0,4));
//        System.out.println(name.replace('r','p'));
//        System.out.println(name.replace("rry", "ier"));
//
//        String modifiedName = "Harryrryrry";
//        System.out.println(modifiedName.indexOf("rry"));
//        System.out.println(modifiedName.indexOf("rry", 4));
//        System.out.println(modifiedName.lastIndexOf("rry", 7));
//
//        System.out.println(name.equals("Harry"));
//        System.out.println(name.equalsIgnoreCase("HarRY"));
//
//        System.out.println("I am escape sequence\tdouble quote");


//        String s = "ram";
//        System.out.println(s.length());
//        String s1 = "ram";
//        String s2 = "ram";
//        if(s1.equals(s2))
//            System.out.println("it is equal");
//        else
//            System.out.println("it is not equal");
//        String s="refer";
//        int i,j,len,flag=0;
//        len=s.length();
//        for(i=0,j=len-1;i<=j;i++,j--)
//        {
//             if(s.charAt(i)!=s.charAt(j))
//                 flag=1;
//        }
//        if(flag==0)
//            System.out.println("it is pallindrome");
//        else
//            System.out.println("it is not pallindrome");
//        String s = "roshan";
//        int len=s.length();
//        int count=0;
//        for(int i=0;i<len;i++)
//        {
//            if (s.charAt(i)=='a' || s.charAt(i)=='A')
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //Character Patterns in Java
//        String s ="AMAN";
//        for(int i=0;i<s.length();i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(s.charAt(j));
//            }
//            System.out.println();
//        }
//        for(int i=s.length()-1;i>=0;i--)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(s.charAt(j));
//            }
//            System.out.println();
//        }
//        for(int i=0;i<s.length();i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(s.charAt(j));
//            }
//            System.out.println();
//        }
//        for(int i=s.length()-2;i>=0;i--)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(s.charAt(j));
//            }
//            System.out.println();
//        }
        //StringBuffer class
//        String s = "mad";
//         StringBuffer r= new StringBuffer(s);
//         String s2 = new String( r.reverse());
//        if(s2.equals(s))
//        {
//            System.out.println(s);
//            System.out.println("pallindrome ");
//        }
//        else
//        {
//            System.out.println("not pallindrome");
//        }
//        String s1="abc";
//        String s2="abc";
//        if(s1==s2)
//        {
//            System.out.println("equal");
//        }
//        else
//        {
//            System.out.println("unequal");
//        }

//        String s1="abc";
//        for(int i=0;i<s1.length();i++)
//        {
//            for(int j=i;j<s1.length();j++)
//            {
//                System.out.println(s1.substring(i,j+1));
//            }
//        }






    }

}
