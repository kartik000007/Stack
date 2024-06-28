package INFIX;

import java.util.Stack;

public class prefix_to_infix {
    public static void main(String[] args) {
        String s = "*+ab-cd";
        pretoin(s);
    }

    private static void pretoin(String s) {
        Stack<String> sk = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isOperator(s.charAt(i))) {
                String left = sk.pop();
                String right = sk.pop();
                String ans = "(" + left + s.charAt(i) + right + ")";
                sk.push(ans);
            } else {
                sk.push(String.valueOf(s.charAt(i)));
            }
        }

        System.out.println(sk.peek());

    }

    private static boolean isOperator(char ch) {
        return ch == '*' || ch == '-' || ch == '+' || ch == '/';
    }
}
