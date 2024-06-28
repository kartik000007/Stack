package leetcode;

import java.util.Stack;

public class valid_parantheses_20 {
    public static void main(String[] args) {
        String s="{[]}()";
//        System.out.println(isValid(s));
        System.out.println(para(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> sk=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' ||ch=='[' ){
                sk.push(s.charAt(i));
            }
            else {
                if(sk.empty()){
                    return false;
                }
                if((sk.peek()=='(' && ch==')') ||(sk.peek()=='{' && ch=='}')||(sk.peek()=='[' && ch==']') ){
                    sk.pop();
                }else {
                    return false;
                }
            }

        }
        if(sk.empty()){
            return true;
        }

        return false;
    }

    private static boolean para(String s){
        Stack<Character> sk=new Stack<>();

        for(char ch:s.toCharArray()){

            if(ch=='(' || ch=='{' || ch=='['){
                sk.push(ch);
            }
            else {
                if(sk.isEmpty()){
                    return false;
                }
                if ((ch == '}' && sk.peek() == '{')
                        || (ch == ')' && sk.peek() == '(' ||
                        (ch == ']' && sk.peek() == '['))) {
                    sk.pop();
                } else {
                    return false;
                }
            }
        }
        return sk.empty();
    }
}
