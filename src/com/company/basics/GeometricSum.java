package com.company.basics;

public class GeometricSum {
    public static float geometricSum(int k)
    {
        if (k==0)
        {
            return 1;
        }
        float m =1;
        int k1 = k;
        while (k1!=0)
        {
            m = m * 2;
            k1--;
        }
        return 1/m + geometricSum(k-1);
    }
    public static void main(String[] args) {
        System.out.println(geometricSum(3));
    }
}
