package com.jade.sword_offer_assault.easy;

/**
 * @description: 二进制加法
 * @date: 2022/11/13
 **/
public class BinaryAddition {

    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
        );
    }

    public static void main(String[] args) {
        String a = "10100100";
        String b = "010101111";
        String res = addBinary(a, b);
        System.out.println(res);
    }
}
