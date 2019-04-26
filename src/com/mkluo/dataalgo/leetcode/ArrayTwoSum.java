package com.mkluo.dataalgo.leetcode;

/**
 * @author luomingkui
 * @date 2019/4/25 上午11:14
 * @desc leetcode1：求两个数的和等于某一个数指
 */
public class ArrayTwoSum {

    public static void main(String[] args){
        ArrayTwoSum ats = new ArrayTwoSum();
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


