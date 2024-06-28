package INFIX;

import java.util.List;
import java.util.Stack;

//   1.      Scan the infix expression from left to right.
//   2.        If the scanned character is an operand, put it in the postfix expression.
//   3.      If the scanned character is a ‘(‘, push it to the stack.
//   4.       If the scanned character is a ‘)’, pop the stack and output it until a ‘(‘ is encountered, and discard both the parenthesis.
//   5.      Repeat steps 2-5 until the infix expression is scanned.
//   6.       Once the scanning is over, Pop the stack and add the operators in the postfix expression until it is not empty.
//   7.     Finally, print the postfix expression.
public class infixToPostfix {
    public static void main(String[] args) {
        String s = "a+(d*e)";
        String a="a";
       s.contains(a);

        System.out.println(postfix(s));
    }


    public static String postfix(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.toString();
    }
//
//    public static String INFIX.infixToPostfix(String infix) {
//        StringBuilder postfix = new StringBuilder();
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : infix.toCharArray()) {
//            if (Character.isLetterOrDigit(c)) {
//                postfix.append(c);
//            } else if (c == '(') {
//                stack.push(c);
//            } else if (c == ')') {
//                while (!stack.isEmpty() && stack.peek() != '(') {
//                    postfix.append(stack.pop());
//                }
//                stack.pop(); // Discard the '('
//            } else { // Operator
//                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
//                    postfix.append(stack.pop());
//                }
//                stack.push(c);
//            }
//        }
//
//        while (!stack.isEmpty()) {
//            postfix.append(stack.pop());
//        }
//
//        return postfix.toString();
//    }

    private static int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
}
