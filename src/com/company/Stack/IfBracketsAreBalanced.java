package com.company.Stack;

import java.util.Stack;

public class IfBracketsAreBalanced {

    public static boolean isBalanced(String expression) {
        boolean flag = true;
        Stack<Character> stack1 = new Stack<>();

        for (int i=0; i<expression.length();i++){
            if(expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{'){
                stack1.push(expression.charAt(i));
            }
            if(stack1.isEmpty()){
                flag = false;
            }
            else {
                if (expression.charAt(i) == ')' && stack1.peek() == '(') {
                    stack1.pop();
                } else if (expression.charAt(i) == '}' && stack1.peek() == '{') {
                    stack1.pop();
                } else if (expression.charAt(i) == ']' && stack1.peek() == '[') {
                    stack1.pop();
                }
            }

        }


        if (stack1.isEmpty()){
            flag = true;
        }
        else {
            flag = false;
        }
        return flag;
        //Your code goes here
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

    }
}
