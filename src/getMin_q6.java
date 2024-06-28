import java.util.Stack;

public class getMin_q6{
    public static void main(String[] args) {

        Stack<Integer> sk=new Stack<>();
        Stack<Integer> minstack=new Stack<>();
       add(60,sk,minstack);
        add(20,sk,minstack);
        add(10,sk,minstack);
        add(20,sk,minstack);
        add(5,sk,minstack);

        getMin(minstack);
        remove(sk,minstack);
//        remove(sk);
        getMin(minstack);

    }

    public static void add(int val,Stack<Integer> sk,Stack<Integer> Minstack) {
        if(sk.isEmpty()){
            sk.push(val);
        }
        sk.push(val);
        if(Minstack.isEmpty()){
            Minstack.push(sk.peek());
        }
        if(sk.peek()<Minstack.peek()){
            Minstack.push(sk.peek());
        }
    }

    public static void remove(Stack<Integer> sk,Stack<Integer> minstack){
        if(sk.peek()==minstack.peek()){
            minstack.pop();
            sk.pop();
        }else{
            sk.pop();
        }
    }

    public static void getMin(Stack<Integer> sk){
        System.out.println(sk.peek());
    }

}
