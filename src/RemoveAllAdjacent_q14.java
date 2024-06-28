import java.util.Stack;

public class RemoveAllAdjacent_q14 {
    public static void main(String[] args) {
        String s="abbaca";
        Stack<Character> sk=new Stack<>();
        sk.push(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0; i--) {
            if(!sk.isEmpty()  && s.charAt(i)==sk.peek()){
                sk.pop();

            }else {
                sk.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while  (!sk.isEmpty()) {
            sb.append(sk.pop());
        }
        System.out.println(sb);
    }
}
