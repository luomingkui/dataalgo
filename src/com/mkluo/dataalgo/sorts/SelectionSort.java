package com.mkluo.dataalgo.sorts;

/**
 * @author luomingkui
 * @date 2019/4/26 下午5:01
 * @desc 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int [] number = {5,900,1,5,77,30,64,700};
        int[] bubbleSort = selectSort(number);
        for (int i : bubbleSort) {
            System.out.println(i);
        }
    }

    public static int[] selectSort(int[] args){
        if (args.length==0) return args;
        for (int i=0;i<args.length-1 ;i++ ){
            int min=i;
            for (int j=i+1;j<args.length ;j++ ){
                if (args[min]>args[j]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=args[i];
                args[i]=args[min];
                args[min]=temp;
            }
        }
        return args;
    }

}
