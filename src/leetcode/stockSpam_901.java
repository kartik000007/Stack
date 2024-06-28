package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stockSpam_901 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateSpan(new int[] {100,80,60,70,60,75,85},7)));

    }


    public static int[] calculateSpan(int price[], int n)
    {
        int[] num=new int[price.length];
        Stack<Integer> sk =new Stack<>();

        sk.push(0);
        num[0]=1;

        for(int i=1;i<price.length;i++){

            while(!sk.isEmpty() && price[i]>=price[sk.peek()]){
                sk.pop();
            }

            num[i]=sk.isEmpty() ? i+1: i-sk.peek();

            sk.push(i);
        }

        return num;
    }

}
