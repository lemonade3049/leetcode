package com.lemonade.leetcode.t3000;

public class MaximumGoodPeopleBasedOnStatements2151 {

    public static void main(String[] args) {
        int[][] map = new int[3][3];

        map[0] = new int[]{2, 1, 2};
        map[1] = new int[]{1, 2, 2};
        map[2] = new int[]{2, 0, 2};

        System.out.println(new MaximumGoodPeopleBasedOnStatements2151().maximumGood(map));

        System.out.println(1);
    }

    public int maximumGood(int[][] statements) {
        int n = statements.length;
        int res = n;

        int[] sayBad = new int[n];
        int[] saidBad = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (statements[i][j] == 0) {
                        sayBad[i]++;
                        saidBad[j]++;
                    }
                }
            }
        }

        while (true) {
            int sayBadNum = 0;
            int saidBadNum = 0;
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (sayBadNum < sayBad[i]) {
                    sayBadNum = sayBad[i];
                    saidBadNum = saidBad[i];
                    index = i;
                } else if (sayBadNum == sayBad[i]) {
                    if (saidBadNum < saidBad[i]) {
                        sayBadNum = sayBad[i];
                        saidBadNum = saidBad[i];
                        index = i;
                    }
                }
            }
            if (sayBadNum == 0 && saidBadNum == 0) {
                return res;
            } else {
                sayBad[index] = 0;
                saidBad[index] = 0;
                res--;
                for (int i = 0; i < n; i++) {
                    if (statements[index][i] == 0) {
                        if (index != i) {
                            saidBad[i]--;
                        }
                    }

                    if (statements[i][index] == 0) {
                        if (index != i) {
                            sayBad[i]--;
                        }
                    }
                }
            }
        }
    }
}
