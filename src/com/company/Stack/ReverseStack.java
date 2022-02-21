package com.company.Stack;

import java.util.Stack;

public class ReverseStack {

    private static void reverseStack(Stack<Integer> s, Stack<Integer>h){
        if (s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverseStack(s, h);
        while (!s.isEmpty()){
            h.push(s.pop());
        }
        s.push(temp);
        while (!h.isEmpty()){
            s.push(h.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> h = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(10);

        reverseStack(s,h);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
