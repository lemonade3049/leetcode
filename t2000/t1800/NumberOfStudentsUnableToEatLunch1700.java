package com.lemonade.leetcode.t2000.t1800;

public class NumberOfStudentsUnableToEatLunch1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int sumStudent = 0;
        int sumSandwich = 0;
        for (int i = 0; i < students.length; i++) {
            sumStudent += students[i];
            sumSandwich += sandwiches[i];
        }

        if (sumSandwich == sumStudent) {
            return 0;
        }
        int res = 0;
        if (sumSandwich > sumStudent) {
            int t = sumSandwich - sumStudent;
            for (int i = students.length - 1; i >= 0; i--) {
                res++;
                if (sandwiches[i] == 1) {
                    t--;
                    if (t == 0) {
                        break;
                    }
                }
            }
        } else {
            int t = sumStudent - sumSandwich;
            for (int i = students.length - 1; i >= 0; i--) {
                res++;
                if (sandwiches[i] == 0) {
                    t--;

                    if (t == 0) {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
