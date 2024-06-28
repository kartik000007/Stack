import java.util.Arrays;

public class OneArrayTwoStack_q15 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int top=push1(arr,10);
        top=push2(arr,20);
        top=pop1(arr,top);
        System.out.println(Arrays.toString(arr));

    }

    private static int push1(int[] arr, int val) {
        int top = -1;
        top++;
        arr[top] = val;
        return top;
    }

    private static int pop1(int[] arr,int top){
        arr[top]=0;
        top--;
        return top;
    }

    private static int pop2(int[] arr,int top){
        arr[top]=0;
        top--;
        return top;
    }
    private static int push2(int[] arr, int val) {
        int top = arr.length;
        top--;
        arr[top] = val;
        return top;
    }

}
