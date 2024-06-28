package leetcode;

import java.util.Stack;

public class validStacksequence_946 {
    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[] {2,1,0},new int[] {1,2,0}));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> num=new Stack<>();
        int k=0;
        for (int j : pushed) {
            num.push(j);
            while (!num.isEmpty() && num.peek()==popped[k]){
                num.pop();
                k++;
            }
        }
        return num.isEmpty();

    }
}
