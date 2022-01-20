package com.company.generics;

public class PairUse {
    public static void main(String[] args) {
//        Pair p = new Pair(1,2);
//        p.setFirst(10);
//        System.out.println(p.getFirst());
//        System.out.println(p.getSecond());
//        Pair<String> p = new Pair<String>("ab","cd");
//        System.out.println(p.getFirst());
//        System.out.println(p.getSecond());
//        p.setFirst("ef");
//        System.out.println(p.getFirst());
//        Pair<Integer> p1 = new Pair<Integer>(2,3);
//        System.out.println(p1.getFirst());
//        System.out.println(p1.getSecond());
//
//        Pair<Double> p2 = new Pair<Double>(2.1,2.3);
//        Pair<Boolean> p3 = new Pair<Boolean>(true,false);
//        Pair<Character> p4 = new Pair<Character>('a','b');
//        Pair<Double,String> p5 = new Pair<Double,String>(2.1,"abc");
//        System.out.println(p5.getFirst());
//        System.out.println(p5.getSecond());

        int a = 12;
        int b = 23;
        int c = 34;
        Pair<Integer,Integer> InternelPair = new Pair<>(a,b);

        Pair<Pair<Integer,Integer>,Integer> p6 = new Pair<>(InternelPair,c);

        System.out.println(p6.getSecond());
        System.out.println(p6.getFirst().getFirst());
        System.out.println(p6.getFirst().getSecond());


    }
}
