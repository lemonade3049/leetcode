package com.lemonade.leetcode.t2000;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class CarPooling1094 {

    public static void main(String[] args) {
        carPooling(new int[1][1], 1);
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<Point> p = new PriorityQueue<>();
        for(int i = 0; i < trips.length; i++){
            p.offer(new Point(trips[i][1], trips[i][0], 1));
            p.offer(new Point(trips[i][2], trips[i][0], 0));
        }
        int highest = 0;
        while (!p.isEmpty()){
            Point t =  p.poll();
            if(t.upDown == 0){
                highest += t.people;
                if(highest > capacity){
                    return false;
                }
            }else{
                highest-= t.people;
            }
        }
        return true;
    }

    static class Point implements Comparable<Point>{
        int people;
        int upDown; // 1 up 0 down
        int position;

        Point(int po, int p, int u){
            this.position = po;
            this.people = p;
            this.upDown = u;
        }

        @Override
        public int compareTo(Point o) {
            if(this.position == o.position){
                return this.upDown - o.upDown;
            }
            return this.position - o.position;
        }
    }
}
