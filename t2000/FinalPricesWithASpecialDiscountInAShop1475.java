package com.lemonade.leetcode.t2000;

import java.util.Stack;

@SuppressWarnings("unused")
public class FinalPricesWithASpecialDiscountInAShop1475 {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(prices[prices.length - 1]);
        res[prices.length - 1] = prices[prices.length - 1];

        for(int i = prices.length - 2; i >= 0; i--){
            if(prices[i] >= stack.peek()){
                res[i] = prices[i] - stack.peek();
                stack.push(prices[i]);
            }else{
                while(!stack.isEmpty() && prices[i] < stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(prices[i]);
                    res[i] = prices[i];
                }else{
                    res[i] = prices[i] - stack.peek();
                    stack.push(prices[i]);
                }
            }
        }
        return res;
    }
}
