package com.company.basics;
class ZeroDenominatorException extends Exception{

}
class Fraction
{
    private int numerator;
    private int denominator;
    public Fraction (int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public int getDenominator()
    {
        return denominator;
    }
    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator)
    {
        if (denominator == 0)
        {
            ZeroDenominatorException e = new ZeroDenominatorException();
            try {
                throw e;
            } catch (ZeroDenominatorException zeroDenominatorException) {
                System.out.println("hey dont input 0 as denominator");
            }
            finally {
                System.out.println("work done");
            }
        }
        this.denominator = denominator;
        simplify();
    }
    public void print()
    {
        if(denominator==1)
        {
            System.out.println(numerator);
        }
        else
        {
            System.out.println(numerator+"/"+denominator);
        }
    }
    private void simplify()
    {
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++)
        {
            if (numerator % i == 0 && denominator % i == 0)
            {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public static Fraction add(Fraction f1, Fraction f2)
    {
        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int NewDen = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNum,NewDen);
        return f;
    }
    public void add(Fraction f2)
    {
        this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }
    public void multiply(Fraction f2)
    {
        this.numerator = this.numerator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }

}

public class FractionUse {
    public static void main(String args[]) throws ZeroDenominatorException
    {
        Fraction f1 = new Fraction(20,30);


        f1.setNumerator(12);
        f1.print();
        int d = f1.getDenominator();
        System.out.println(d);

        f1.setNumerator(10);
        f1.setDenominator(0);
        f1.print();

        Fraction f2 = new Fraction(3,4);
        f1.add(f2);
        f1.print();
        f2.print();

        Fraction f3 = new Fraction(4,5);
        f2.multiply(f3);
        f2.print();
        f3.print();

        Fraction f5 = new Fraction(3,4);
        Fraction f6 = new Fraction(5,6);
        Fraction f7 =  Fraction.add(f5,f6);
        f7.print();
//        f1.add(f2);
//        f1.print();
//        f1.multiply(f2);
//        f1.print();

//        System.out.println(f1.getNumerator());
//        System.out.println(f1.getDenominator());

    }
}
