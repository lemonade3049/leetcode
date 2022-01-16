package com.lemonade.leetcode.t2000;

public class DayOfTheYear1154 {

    public static void main(String[] args) {

        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int temp = 0;
        for (int i = 0; i < days.length; i++) {
            temp += days[i];
            System.out.print(temp + ",");
        }
    }

    public int dayOfYear(String date) {
        int[] days = new int[]{31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        String[] str = date.split("-");
        int year = Integer.valueOf(str[0]);
        int month = Integer.valueOf(str[1]);
        int day = Integer.valueOf(str[2]);

        return (month == 1 ? 0 : days[month - 2]) + day + (month > 2 ? isPlusOne(year) : 0);
    }

    public int isPlusOne(int y) {
        if (y % 4 == 0 && y % 100 != 0) {
            return 1;
        }
        if (y % 100 == 0 && y % 400 == 0) {
            return 1;
        }
        return 0;
    }
}
