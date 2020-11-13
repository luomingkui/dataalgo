package com.mkluo.leetcode;

/**
 * @Description: LeetCode-7-整数反转
 * @Author: luomingkui
 * @Date: Created in 下午3:36 2019/5/14
 * @Version: V1.0
 */

public class LeetCode7 {

    public static void main(String[] args) {
        LeetCode7 leetCode7 = new LeetCode7();
        int abc = leetCode7.reverse(123456);
        System.out.println(abc);
    }
    public int reverse(int x) {
        int r = 0;
        if (x>=Integer.MAX_VALUE || x<=Integer.MIN_VALUE){
            return 0;
        }
        while(x!=0){
            r=10*r+x%10;
            x=x/10;
            if(r>Integer.MAX_VALUE/10&&x>0||r<Integer.MIN_VALUE/10&&x<0){
                return 0;
            }
        }
        return r;
    }

}