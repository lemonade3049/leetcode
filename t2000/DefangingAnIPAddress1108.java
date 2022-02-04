package com.lemonade.leetcode.t2000;


@SuppressWarnings("unused")
public class DefangingAnIPAddress1108 {
    public static void main(String[] args) {
        System.out.println(new DefangingAnIPAddress1108().defangIPaddr("12.1.1.1"));
    }
    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }

    public String defangIPaddr1(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
