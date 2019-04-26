package com.mkluo.dataalgo.sorts;

/**
 * @author luomingkui
 * @date 2019/4/26 下午5:39
 * @desc
 */
public class ShellSort {

    public static void main(String[] args) {
        int [] number = {5,900,1,5,77,30,64,700};
        int [] bubbleSort=shellSort(number);
        for (int i : bubbleSort) {
            System.out.println(i);
        }
    }

    public static  int[] shellSort(int[] array){
        double d1=array.length;
        int temp=0;
        while(true){
            d1= Math.ceil(d1/2);
            int d=(int) d1;
            for(int x=0;x<d;x++){
                for(int i=x+d;i<array.length;i+=d){
                    int j=i-d;
                    temp=array[i];
                    for(;j>=0&&temp<array[j];j-=d){
                        array[j+d]=array[j];
                    }
                    array[j+d]=temp;
                }
            }
            if(d==1)
                break;
        }
        return array;
    }


}
