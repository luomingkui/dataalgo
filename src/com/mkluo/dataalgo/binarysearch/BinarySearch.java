package com.mkluo.dataalgo.binarysearch;

/**
 * @Description: TODO
 * @Author: luomingkui
 * @Date: Created in 上午11:03 2019/4/29
 * @Version: V1.0
 */

public class BinarySearch {

    /**
     * 使用循环实现二分查找算法
     * 注意事项:
     • 循环退出条件是:starte<=end,而不是 start<mid
     • min的取值,使用mid=start+(end-start)/2,而不用 mid=(start+end)/2,因为如果 start和end比较大的话,求和可能会发生int类型的值超出最大范围.,为了把性能优化到极致,可以将除以2转换成位运算,即 start+(end-start)>>1),因为相比除法运算来说,计算机处理位运算要快得。
     • start和end 的更新:start=mid-1,end=mid+1,若直接写成start=mid,end=md,就可能会发生死循环.
     * @param arr
     * @param x
     * @return
     */
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int middle = (low + high)/2;
            if(x == arr[middle]) {
                return middle;
            }else if(x <arr[middle]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 使用递归实现二分查找
     * 二分查找递归实现的局限性：
     • 二分查找依赖的是顺序表结构,即数组.
     • 二分查找针对的是有序数据,因此只能用在插入,删除操作不频繁,一次排序多次查找的场景
     • 数据量太小不适合二分查找,与直接遍历相比效卒提升不明显,但有一个例外,就是数据之间的比较操作非常费时,比如数组中存储的部是长度超过300的字符串,那这是还是尽量减少比较操作使用二分查找吧.
     • 数据量太大也不是适合用二分查找,因为数组需要连续的空间,若数据量太大,往往找不到存储如此大规模数据的连续内存空间
     * @param srcArray
     * @param start
     * @param end
     * @param key
     * @return
     */
    public static int binSearch(int srcArray[], int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
        System.out.println("循环查找：" + (binarySearch(arr, 87) + 1));


        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        System.out.println("递归查找：" + binSearch(srcArray, 0, srcArray.length - 1, 81));
    }
}