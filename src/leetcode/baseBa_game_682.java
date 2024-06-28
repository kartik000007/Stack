package leetcode;

import javax.swing.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class baseBa_game_682 {
    public static void main(String[] args) {
        String[] s={"1","C"};
        System.out.println(calPoints(s));

    }

    public static int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> sk=new Stack<>();
        for (String s : operations) {
            if (Objects.equals(s, "C")) {
                sk.pop();
            } else if (Objects.equals(s, "D")) {
                sk.push(sk.peek() * 2);
            } else if (Objects.equals(s, "+")) {
                int n1 = sk.pop();
                int n2 = sk.pop();
                int n = n1 + n2;
                sk.push(n2);
                sk.push(n1);
                sk.push(n);
            } else {
                sk.push(Integer.valueOf(s));
            }
        }
        while (!sk.isEmpty()){
            sum+=sk.pop();
        }

        return sum;
    }
}
