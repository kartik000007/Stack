package leetcode;

import java.util.Stack;

public class removeOuterParanthesis_1021 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(()"));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> sk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!sk.isEmpty()){
                    sb.append(ch);
                }
                sk.push(ch);
            }else {
                sk.pop();
                if(!sk.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
