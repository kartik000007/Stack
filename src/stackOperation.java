import java.util.Arrays;

public class stackOperation {
    public static void main(String[] args) {
        int[] stack=new int[5];
        int top=-1;
        top=push(stack,top,10);
        top=push(stack,top,20);
        top=push(stack,top,30);
        top=push(stack,top,40);
        top=push(stack,top,50);

        top=pop(stack,top);
        print(stack,top);

    }
    private static int push(int[] stack,int top,int val){
        if(top==stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=val;
        return top;
    }
    private static int pop(int[] stack,int top){
        if(top==-1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.println("value delete in stack "+stack[top]);
        top--;
        return top;
    }

    private static void print(int[] stack,int top){
        for (int i = top; i >=0; i--) {
            System.out.print(stack[i]+" ");
        }
    }
}
