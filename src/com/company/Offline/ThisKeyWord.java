package com.company.Offline;

public class ThisKeyWord {
    int n1,n2;
    void sum(int n1,int n2)
    {
        n1 = this.n1;
        n2 = this.n2;
        System.out.println(n1+n2);
//        System.out.println();
    }
    void sum2(int n1,int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
        System.out.println(n1+n2);
    }
    public static void main(String[] args) {
        ThisKeyWord obj = new ThisKeyWord();
        obj.sum(1,2);
        obj.sum2(1,2);

    }
}
