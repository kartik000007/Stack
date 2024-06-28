package leetcode;

import java.util.*;

public class dailyTemperature_739 {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        //System.out.println(Arrays.toString(dailyTemperatures(temperatures)));

        //System.out.println(findDuplicate(new int[]{1, 2, 3, 5, 2, 7, 8}));
        // sortColors(new int[]{0,1,2,0,2,1,2,1});
       // countduplicate("greeksforgreeks");
      //  System.out.println(longestCommonPrefix(new String[] {"flower","flow","floight"}));
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] ans=new int[temperatures.length];
        Deque<Integer> q=new LinkedList<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!q.isEmpty() && temperatures[i]>temperatures[q.peek()]){
                int preIndex=q.pop();
                ans[preIndex]=i-preIndex;
            }
            q.push(i);
        }
        return ans;
//        int[] ans = new int[temperatures.length];
//        Stack<Integer> sk = new Stack<>();
//        for (int i = 0; i < temperatures.length; i++) {
//            while (!sk.isEmpty() && temperatures[i] > temperatures[sk.peek()]) {
//                int preday = sk.pop();
//                ans[preday] = i - preday;
//            }
//            sk.push(i);
//        }
//        return ans;



//        int[] ans = new int[temperatures.length];
//        Stack<Integer> stack = new Stack<>();
//        for (int currDay = 0; currDay < temperatures.length; currDay++) {
//            while (
//                    !stack.isEmpty() &&
//                            temperatures[currDay] > temperatures[stack.peek()]
//            ) {
//                int prevDay = stack.pop();
//                ans[prevDay] = currDay - prevDay;
//            }
//            stack.add(currDay);
//        }
//        return ans;
    }

    //  public static int findDuplicate(int[] nums) {
//        int right = 0;
//        int left = nums.length - 1;
//        while (right < left) {
//            if (nums[right] == nums[left]) {
//                return nums[right];
//            } else {
//
//                left--;
//            }
//        }
//        return 0;
//    }

    //    public static void sortColors(int[] arr) {
//        int zero=0;
//        int one=0;
//        int two=0;
//        for(int num:arr){
//            if(num==0){
//                zero++;
//            }else if(num==1){
//                one++;
//            }else{
//                two++;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(zero!=0){
//                arr[i]=0;
//                zero--;
//            }else if(one!=0){
//                arr[i]=1;
//                one--;
//            }else{
//                arr[i]=2;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
   // private static void countduplicate(String s) {
//        int[] fre = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            fre[s.charAt(i) - 'a'] += 1;
//        }
//
//        for (int i = 0; i < fre.length; i++) {
//            if (fre[i] > 1) {
//                System.out.println(((char) (i + 97)) + "," + " count" +"= "+ fre[i]);
//            }
//        }
//
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        String prefix=strs[0];
//
//        for(String i:strs){
//            while(i.indexOf(prefix)!=0){
//                prefix=prefix.substring(0,prefix.length()-1);
//            }
//        }
//        return prefix;
//    }
public static boolean validPalindrome(String s) {
    int start=0;
    int end=s.length()-1;

    while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
}
