package com.lemonade.leetcode.t2000;

public class ReplaceAllQuestionsToAvoidConsecutiveRepeatingCharacters1576 {

    public static void main(String[] args) {
        String a = "?>?";
        a = a.replaceAll("?", "sss");

        System.out.println(a);
    }

    public String modifyString(String s) {

        char[] arr2 = s.toCharArray();
        s = s.replaceAll("/?/", "a");
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '?'){
                if(i > 0 && i < arr.length - 1){

                }
            }
        }
        return "";
    }
}
