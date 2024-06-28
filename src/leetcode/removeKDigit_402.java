package leetcode;

import java.util.Stack;

public class removeKDigit_402 {
    public static void main(String[] args) {
        System.out.println(removeKdigits("10",2));
    }
    public static String removeKdigits(String s, int k) {
        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));
        int i =1;
        while(k > 0){
            if(stack.peek()-0  < s.charAt(i)-0){
                stack.push(s.charAt(i));
                i++;
            }
            else{
                stack.pop();
                stack.push(s.charAt(i));
                i++;
                k--;
            }
        }
        while(i < s.length()){
            stack.push(s.charAt(i));
            i++;
        }
        return stack.toString();
    }
}
