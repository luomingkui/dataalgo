package com.mkluo.dataalgo.test;

/**
 * @Auther: luomingkui
 * @Date: 2019/3/5 16:22
 * @Description:
 */

public class Test {

    public static void main(String[] args) {
        cal(1000);
    }

    static int cal(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

}