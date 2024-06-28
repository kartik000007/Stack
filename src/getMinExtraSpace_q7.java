import java.util.Stack;

public class getMinExtraSpace_q7 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;
        min=push(stack,10,min);
        min=push(stack,8,min);
        min=push(stack,5,min);
        min=push(stack,7,min);
        min=push(stack,1,min);
        min=pop(stack,min);
        System.out.println(min);
    }

    static int push(Stack<Integer> stack, int value, int min) {
        if (stack.isEmpty()) {
            min = value;
            stack.push(value);
        } else if (min > value) {
            stack.push(value * 2 - min);
            min = value;
        }
        return min;
    }

    static int pop(Stack<Integer> stack, int min) {
        int prevVal = min * 2 - stack.peek();
        if (prevVal > min) {
            min = prevVal;
            stack.pop();
            return min;
        }
        return min;
    }

    private static void min(Stack<Integer> sk){
        System.out.println();
    }
}
