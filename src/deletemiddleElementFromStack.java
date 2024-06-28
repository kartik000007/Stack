import java.util.Stack;

public class deletemiddleElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> sk = new Stack<>();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);
        sk.push(5);

        int mid = sk.size() / 2;

        Stack<Integer> sk2 = new Stack<>();
        while (mid != 0) {
            sk2.push(sk.peek());
            sk.pop();
            mid--;
        }
        sk.pop();
        while (!sk2.isEmpty()) {
            sk.push(sk2.peek());
            sk2.pop();
        }
        while (!sk.isEmpty()) {
            System.out.print(sk.peek() + " ");
            sk.pop();
        }
    }

}
