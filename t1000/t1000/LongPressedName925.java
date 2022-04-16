package com.lemonade.leetcode.t1000.t1000;

public class LongPressedName925 {
    public static void main(String[] args) {
        boolean longPressedName = new LongPressedName925().isLongPressedName("alex", "aaleex");
        System.out.println(longPressedName);
    }

    public boolean isLongPressedName(String name, String typed) {
        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;

        while (arr[0] < nameChars.length && arr[1] < typedChars.length) {
            if ((arr[1] != 1 || arr[0] != 1) && nameChars[arr[0]] != typedChars[arr[1]]) {
                return false;
            }

            if (!f(nameChars, typedChars, arr)) {
                return false;
            }

        }
        if (arr[0] == nameChars.length && arr[1] == typedChars.length) {
            return true;
        } else {
            return false;
        }
    }

    private boolean f(char[] nameChars, char[] typedChars, int[] arr) {
        int x = 0;
        int y = 0;

        while (nameChars[arr[0]] == nameChars[arr[0] - 1]) {
            arr[0]++;
            x++;
        }
        while (nameChars[arr[1]] == nameChars[arr[1] - 1]) {
            arr[1]++;
            y++;
            if (x > y) {
                return false;
            }
        }
        return true;
    }
}

