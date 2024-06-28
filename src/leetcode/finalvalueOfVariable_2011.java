package leetcode;

public class finalvalueOfVariable_2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[] {"--X","X++","X++"}));

    }
    public static int finalValueAfterOperations(String[] op) {
        int x=0;
        for (String s : op) {
            if (s.charAt(1) == '+') {
                x++;
            } else x--;
        }
        return x;
    }
}
