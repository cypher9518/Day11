package com.basicjava;

public class CouponNo {

    public static void main(String[] args) {
        char[] chars = "abcdefghijkl".toCharArray();
        int max = 100000000;
        double d = Math.random();
        int random = (int) (d * max);
        String xy = "";
        System.out.println("Random double " + d + " Random at start " + random);

        while (random > 0) {
            xy = xy + (chars[random % chars.length]);
            random /= chars.length;
        }
        String couponCode = xy.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}