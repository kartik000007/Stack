package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class nextGreatestElement_496 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(greatest(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));

        System.out.println(Arrays.toString(ele(new int[] { 6,1,3,2,4})));
    }

//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] result = new int[nums1.length];
//        Stack<Integer> stack = new Stack<>();
//        int[] nextGreater = new int[10001];
//        Arrays.fill(nextGreater, -1);
//
//        for (int num : nums2) {
//            while (!stack.isEmpty() && num > stack.peek()) {
//                int smallerNum = stack.pop();
//                nextGreater[smallerNum] = num;
//            }
//            stack.push(num);
//        }
//
//        for (int i = 0; i < nums1.length; i++) {
//            result[i] = nextGreater[nums1[i]];
//        }
//
//        return result;
//    }

//    private static int[] greatest(int[] n1, int[] n2) {
//        int[] ans = new int[n1.length];
//
//        for (int i = 0; i < n1.length; i++) {
//            ans[i] = ele(n1[i], n2);
//        }
//
//        return ans;
//    }

    private static int[] ele(int[] arr) {
        Stack<Integer> sk = new Stack<>();
        int[] ans=new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            if(sk.isEmpty()){
                sk.push(arr[i]);
                ans[i]=-1;
                continue;
            }

            while (!sk.isEmpty() && arr[i]>sk.peek()){
                sk.pop();
            }
            if(sk.isEmpty()){
                ans[i]=-1;
                sk.push(arr[i]);
                continue;
            }
            ans[i]=sk.peek();
            sk.push(arr[i]);
        }

        return ans;
    }
}
