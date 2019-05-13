package com.mkluo.dataalgo.leetcode;

/**
 * @Description: 两数之和：https://blog.csdn.net/Luomingkui1109/article/details/90075287
 * @Author: luomingkui
 * @Date: Created in 下午9:55 2019/5/11
 * @Version: V1.0
 */

public class LeetCode1 {

    public static void main(String[] args){
        LeetCode1 ats = new LeetCode1();
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int[] indices = ats.twoSum(array, 7);
        if(indices!=null){
            System.out.println(indices[0]+"    "+indices[1]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}