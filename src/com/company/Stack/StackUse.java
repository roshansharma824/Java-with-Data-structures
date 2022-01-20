package com.company.Stack;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException {
//        StackUsingArray stack = new StackUsingArray(3);
//        for (int i=1;i<=5;i++){
//            stack.push(i);
//        }
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
        for (int i=1;i<=5;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
