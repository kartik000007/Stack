package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Stockprice_1475 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8, 4, 6, 2, 3})));
    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> sk = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!sk.isEmpty() && prices[i] <= prices[sk.peek()]) {
                prices[sk.pop()] -= prices[i];
            }
            sk.push(i);
        }

        return prices;
    }
}
