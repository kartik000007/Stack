package leetcode;

import java.util.Stack;

public class _2211_Count_Collisions_on_a_Road {
    public static void main(String[] args) {

    }
    public static int countCollisions(String directions) {
        Stack<Character> car=new Stack<>();
        int count=0;
        for (int i = 0; i < directions.length(); i++) {
         if(car.push(directions.charAt(i)).equals(car.push(directions.charAt(i+1)))){
             count++;
         }

        }


        return 0;
    }
}
