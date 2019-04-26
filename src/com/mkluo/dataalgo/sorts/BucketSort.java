package com.mkluo.dataalgo.sorts;

/**
 * @author luomingkui
 * @date 2019/4/26 下午6:38
 * @desc
 * 桶排序（Bucket Sort）
 */
public class BucketSort {

    public static void main(String[] args) {
        int[] x = { 29, 25, 3, 49, 9, 37, 21, 43 };
        int[] sorted = bucketSort(x, 99);
        for (int i = 0; i < sorted.length; i++)
        {
            if (sorted[i] > 0)
                System.out.println(sorted[i]);
        }
    }

    public static int[] bucketSort(int[] nums, int maxNum){
        int[] sorted = new int[maxNum+1];

        for(int i=0; i<nums.length; i++){
            sorted[nums[i]] = nums[i];//把数据放到对应索引的位置
        }
        return sorted;
    }

}
