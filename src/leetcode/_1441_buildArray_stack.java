package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1441_buildArray_stack {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[] {1,3},3));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String > ans=new ArrayList<>();
        Stack<Integer> sk=new Stack<>();
        int j=0;
        for (int i = 1; i <=target[target.length-1];i++) {
            ans.add("push");

            if (i!=target[j]) {
                ans.add("pop");
            }else
                j++;
        }
        return ans;
    }

    public static int minAddToMakeValid(String s) {

        Stack<Character> sk=new Stack<>();
        sk.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(!sk.isEmpty() && s.charAt(i)==')' && sk.peek() == '('){
                sk.pop();
            }else
              sk.push(s.charAt(i));
        }
        return sk.size();
    }
    public boolean checkValidString(String s) {
        if(s.charAt(0)==')'){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

        }

            return true;
    }
}
