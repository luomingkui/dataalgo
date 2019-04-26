package com.mkluo.dataalgo.sorts;

/**
 * @author luomingkui
 * @date 2019/4/26 下午5:28
 * @desc 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int [] number = {5,900,1,5,77,30,64,700};
        int[] bubbleSort = insertSort(number);
        for (int i : bubbleSort) {
            System.out.println(i);
        }
    }

    public static int[] insertSort(int[] args){
        for(int i=1;i<args.length;i++){
            for(int j=i;j>0;j--){
                if (args[j]<args[j-1]){
                    int temp=args[j-1];
                    args[j-1]=args[j];
                    args[j]=temp;
                }else break;
            }
        }
        return args;
    }

}
