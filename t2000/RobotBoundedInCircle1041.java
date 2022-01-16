package com.lemonade.leetcode.t2000;

public class RobotBoundedInCircle1041 {
    public static void main(String[] args) {
        System.out.println((-4) % 6);
    }

    public boolean isRobotBounded(String instructions) {
        char[] cArr = instructions.toCharArray();
        int turnNum = 0;
        int x = 0;
        int y = 0;
        for (int t = 0; t < 4; t++) {
            for (int i = 0; i < cArr.length; i++) {
                if (cArr[i] == 'L') {
                    turnNum++;
                    if (turnNum == 4) {
                        turnNum = 0;
                    }
                } else if (cArr[i] == 'R') {
                    turnNum--;
                    if (turnNum == -1) {
                        turnNum = 3;
                    }
                } else {
                    switch (turnNum) {
                        case 0:
                            x++;
                            break;
                        case 1:
                            y++;
                            break;
                        case 2:
                            x--;
                            break;
                        case 3:
                            y--;
                            break;
                        default:
                            break;
                    }
                }
            }
            if (x == 0 && y == 0) {
                return true;
            }
        }
        return false;
    }
}
