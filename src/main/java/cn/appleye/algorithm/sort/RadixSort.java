package cn.appleye.algorithm.sort;

import cn.appleye.algorithm.util.LogUtil;

/**
 * @author charles on 2018/3/12
 * 基数排序
 */
public class RadixSort {
    public static void sort(int[] num){
        int size = num.length;
        if(size <= 1){
            return;
        }

        int max = num[0];
        for(int i=1; i<size; i++){
            if(max < num[i]){
                max = num[i];
            }
        }

        int k = 0;
        while(max > 0){
            max /=10;
            k++;
        }

        for(int i=1; i<=k; i++){
            for(int h = 0; h<10; h++){
                for(int j=1; j<size; j++){
                    if(getBase(num[j-1], i) > getBase(num[j], i)){
                        int temp = num[j];
                        num[j] = num[j-1];
                        num[j-1] = temp;
                    }
                }
            }
        }
    }

    public static int getBase(int value, int k){
        while(k > 1){
            value = value/10;
            k--;
        }

        return value%10;
    }
}
