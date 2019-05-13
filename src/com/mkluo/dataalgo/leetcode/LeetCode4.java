package com.mkluo.dataalgo.leetcode;

/**
 * @Description: LeetCode-4-寻找两个有序数组的中位数
 * @Author: luomingkui
 * @Date: Created in 下午9:48 2019/5/11
 * @Version: V1.0
 */

public class LeetCode4 {

    public static void main(String[] args) {
        LeetCode4 leetCode4 = new LeetCode4();
        int[] A = new int[]{1,2,3,4,5};
        int[] B = new int[]{6,7,8,9,10,11};
        Double abc = leetCode4.findMedianSortedArrays(A, B);
        System.out.println(abc);
    }

    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) {
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1;
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1;
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

}