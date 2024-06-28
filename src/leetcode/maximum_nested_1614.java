package leetcode;

public class maximum_nested_1614 {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";

        int ans=0;
        int countOpen=0;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='('){
                countOpen++;
            } else if (s.charAt(i)==')') {
                countOpen--;
            }

            ans=Math.max(ans,countOpen);
        }
        System.out.println(ans);
    }
}
