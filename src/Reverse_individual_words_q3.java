public class Reverse_individual_words_q3 {
    public static void main(String[] args) {
        String s="hello good morning every one";
        reverse(s);
    }

    private static void reverse(String s){
        char[] stack=new char[s.length()];
        int top=-1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                    top=push(stack,top,s.charAt(i));
            }
            else {
                while (!isEmpty(top)){
                    top=pop(stack,top);
                }
                System.out.print(" ");
            }
        }
        while (!isEmpty(top)){
            top=pop(stack,top);
        }
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
    private static int push(char[] stack,int top,char val){
        if(top==stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=val;
        return top;
    }

}
