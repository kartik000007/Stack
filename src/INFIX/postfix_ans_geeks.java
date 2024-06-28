package INFIX;

import java.util.Objects;
import java.util.Stack;

public class postfix_ans_geeks {
    public static void main(String[] args) {
        String s="2 3 1 * + 9 -";
        String[] ss=s.split(" ");
        Stack<Integer> sk = new Stack<>();
        for (String s1 : ss) {
//            int a=Integer.parseInt(s1);
            if(Objects.equals(s1, "+") || Objects.equals(s1, "-") || Objects.equals(s1, "/") || Objects.equals(s1, "*")) {
                int right = sk.pop();
                int left = sk.pop();
                switch (s1) {
                    case "+":
                        sk.push(left + right);
                        break;
                    case "-":
                        sk.push(left - right);
                        break;
                    case "*":
                        sk.push(left * right);
                        break;
                    case "/":
                        sk.push(left / right);
                        break;
                }
            }else{
                sk.push(Integer.parseInt(s1));
            }
        }
        System.out.println(sk.peek());
    }

}
