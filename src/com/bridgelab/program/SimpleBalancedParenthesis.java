package com.bridgelab.program;

public class SimpleBalancedParenthesis {
    public static void main(String[] args) {

        String expression = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
        System.out.println("Length = " + expression.length());

        Implementations.StackImplementUsingLinkList<Character> stack = new Implementations.StackImplementUsingLinkList<Character>();
        boolean isBalanced = false;

        for (int i = 0; i < expression.length(); i++) {
            isBalanced = false;
            if (expression.charAt(i) != ')') {
                stack.push(('('));
                System.out.println("Peek : " + stack.peek());
            } else if (expression.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    isBalanced = true;
                }
            }

        }
        if (stack.isEmpty() && isBalanced) {
            System.out.println("\n Expression has balanced parenthesis");
        } else {
            System.out.println("\n Expression has not balanced parenthesis");
        }
    }
}