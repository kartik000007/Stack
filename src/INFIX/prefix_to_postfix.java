package INFIX;

import java.util.Stack;

public class prefix_to_postfix {
    public static void main(String[] args) {
        String s="*+ab-cd";
        pretopost(s);
    }

    private static void pretopost(String s){
        Stack<String> sk=new Stack<>();

        for (int i = s.length()-1; i >=0 ; i--) {
            if(isOperator(s.charAt(i))){
                String right=sk.pop();
                String left=sk.pop();
                String ans= right+left+s.charAt(i);
                sk.push(ans);
            }else
                 sk.push(String.valueOf(s.charAt(i)));
        }
        System.out.println(sk.peek());
    }
    private static boolean isOperator(char ch) {
        return ch == '*' || ch == '-' || ch == '+' || ch == '/';
    }
}
