import java.util.Stack;

public class delete_middle_element {
    public static void main(String[] args) {
        Stack<Integer> sk=new Stack<>();

        sk.push(10);
        sk.push(20);
        sk.push(30);
        sk.push(40);
        sk.push(50);
//        System.out.println((sk.size()+1)/2);

        System.out.println(deleteMid(sk,sk.size()));
    }
    public static Stack<Integer> deleteMid(Stack<Integer> s, int sizeOfStack){
        Stack<Integer> sk=new Stack<>();
        if(sizeOfStack%2==0){
            sizeOfStack++;
        }
        int mid=((sizeOfStack+1)/2);
        while (mid!=0){
            sk.push(s.pop());
            mid--;
        }
        sk.pop();

        while (!sk.isEmpty()){
            s.push(sk.pop());
        }
        
        return s;
        // code here
    }
}
