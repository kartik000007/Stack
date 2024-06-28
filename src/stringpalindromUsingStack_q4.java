public class stringpalindromUsingStack_q4 {
    public static void main(String[] args) {
        String s = "kalak";


    }

    public static void palindrom(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            top = push(stack, top, s.charAt(i));
        }
        String s1="";


    }

    private static int push(char[] stack, int top, char val) {
        top++;
        stack[top] = val;
        return top;
    }
    private static boolean isEmpty(int top){
        if(top==-1){
            return true;
        }
        return false;
    }
    private static int pop(char[] stack,int top){
        if(top==-1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.print(stack[top]+"");
        top--;
        return top;
    }

}
