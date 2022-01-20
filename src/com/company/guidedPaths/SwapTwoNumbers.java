package com.company.guidedPaths;

import com.company.generics.Pair;

public class SwapTwoNumbers {

    public static Pair< Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
        int a = swapValues.getFirst();
        int b = swapValues.getSecond();


        swapValues.setFirst(b);
        swapValues.setSecond(a);


        return swapValues;

        // Write your code here.
    }

}
