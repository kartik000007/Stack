package INFIX;

import java.util.Stack;

public class postfix_to_prefix {
    public static void main(String[] args) {
        String s="ab+cd-*";
        posttopre(s);
    }

    private static void posttopre(String s){
        Stack<String> sk=new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if(isOperator(s.charAt(i))){
                String right=sk.pop();
                String left=sk.pop();
                String ans= s.charAt(i)+left+right;
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
