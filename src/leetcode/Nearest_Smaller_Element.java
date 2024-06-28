package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Nearest_Smaller_Element {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(4, 5, 2, 10, 8));
        System.out.println(prevSmaller(arr));
    }

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> a) {
        Stack<Integer> sk=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(-1);
        sk.push(a.get(0));
        for (int i = 1; i < a.size(); i++) {
            if(sk.peek()<a.get(i)){
                ans.add(sk.peek());
//                sk.push(a.get(i));
            }else{
                sk=new Stack<>();
                sk.push(a.get(i));
                ans.add(-1);
            }
        }
        return ans;
    }
}
