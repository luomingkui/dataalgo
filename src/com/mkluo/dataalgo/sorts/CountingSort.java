package com.mkluo.dataalgo.sorts;

import java.util.Arrays;

/**
 * @author luomingkui
 * @date 2019/4/26 下午6:31
 * @desc
 * 计数排序（Counting Sort）
 */
public class CountingSort {
    public static void main(String[] args) {
        //测试
        int[] arr = {1,4,6,7,5,4,3,2,1,4,5,10,9,10,3};
        sortCount(arr, 1, 10);
        System.out.println(Arrays.toString(arr));
    }

    //计数排序的初步实现，使用了多余的空间，可以尝试不使用多余的空间
    public static void sortCount(int[] arr, int m, int n) {
        int len = arr.length;
        int[] tem = new int[n - m + 1];
        for(int i = 0; i < len; i++) {
            tem[arr[i] - m] += 1;
        }
        for(int i = 0, index = 0; i < tem.length; i++) {
            int item = tem[i];
            while(item-- != 0) {
                arr[index++] = i + m;
            }
        }
    }

}