package com.mkluo.dataalgo.leetcode;

/**
 * @Description: LeetCode-9-回文数
 * @Author: luomingkui
 * @Date: Created in 下午4:56 2019/5/14
 * @Version: V1.0
 */

public class LeetCode9 {

    public static void main(String[] args) {

        LeetCode9 leetCode9 = new LeetCode9();
        Boolean abc = leetCode9.isPalindrome(105);
        System.out.println(abc);

    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int z = x;
        int y = 0;
        while(x!=0){
            int pop = x%10;
            x = x/10;
            try{
                y = y * 10 + pop;
            }catch(Exception e){
                return false;
            }
        }
        return z == y;
    }
}
