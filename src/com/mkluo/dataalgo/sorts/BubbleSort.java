package com.mkluo.dataalgo.sorts;

/**
 * @author luomingkui
 * @date 2019/4/26 下午4:56
 * @desc
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] number = {5,900,1,5,77,30,64,700};

        //冒泡排序
        int[] bubbleSort = bubbleSort(number);
        for (int i : bubbleSort) {
            System.out.println(i);
        }

        System.out.println("===冒泡排序===");
        //冒泡排序
        int[] bubbleSort1 = bubbleSort(number,8);
        for (int i : bubbleSort1) {
            System.out.println(i);
        }


    }

    // 冒泡排序
    public static int[] bubbleSort(int[] args){
        for(int i=0;i<args.length-1;i++){
            for(int j=i+1;j<args.length;j++){
                if (args[i]>args[j]){
                    int temp=args[i];
                    args[i]=args[j];
                    args[j]=temp;
                }
            }
        }
        return args;
    }

    // 冒泡排序，a是数组，n表示数组大小
    public static int[] bubbleSort(int[] a, int n) {
        if (n <= 1) return a;

        for (int i = 0; i < n; ++i) {
            // 提前退出标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    // 此次冒泡有数据交换
                    flag = true;
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
        return a;
    }

}
