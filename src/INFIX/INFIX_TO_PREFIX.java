package INFIX;

//  STEP -1 :: first reverse String but remember when "(" It converts into ")" and reverse

//  STEP-2  :: convert into postfix

// STEP - 3 :: Then reverse String as it is Step 1


import java.util.Arrays;
import java.util.Stack;

public class INFIX_TO_PREFIX {

    public static void main(String[] args) {
        String s="a+(b*c)";

        System.out.println(ConvertIntoPostfix(s));

    }



    private static String ConvertIntoPostfix(String s){

        Stack<Character> op=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch: s.toCharArray()){

            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            } else if (ch=='(') {
                op.push(ch);
            }else if(ch==')'){
                while (!op.isEmpty() && op.peek()!='('){
                    sb.append(op.pop());
                }
                op.pop();
            }
            else {
                while (!op.isEmpty() && preference(ch)<=preference(op.peek())){
                    sb.append(op.pop());
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()){
            sb.append(op.pop());
        }

        return reverse(sb.toString());
    }

    private static int preference(char ch){
        return switch (ch) {
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    private static String reverse(String s){
            StringBuilder ans = new StringBuilder();

        for (int i = s.length()-1; i >= 0 ; i--) {
         if(s.charAt(i) == ')'){
             ans.append('(');
        }
         else if(s.charAt(i) == '('){
             ans.append(')');
         }
         else{
             ans.append(s.charAt(i));
         }
        }

        return ans.toString();
    }



}

