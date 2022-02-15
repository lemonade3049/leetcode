package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class TimeNeededToBuyTickets2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        int t = tickets[k];
        for(int i = 0; i < k; i++){
            res += Math.min(tickets[i], t);
        }

        res += t;
        for(int i = k + 1; i < tickets.length; i++){
            res += Math.min(tickets[i], t - 1);
        }
        return res;
    }
}
