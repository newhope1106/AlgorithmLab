package cn.appleye.algorithm.sort;

/**
 * @author charles on 2018/3/16
 * 计数排序
 */
public class CountSort {
    public static void sort(int[] num){
        int size = num.length;

        if(size <= 1){
            return;
        }

        int min=num[0], max=num[0];

        for(int i=1; i<size; i++){
            if(num[i] > max){
                max = num[i];
            } else if(num[i] < min){
                min = num[i];
            }
        }

        int bucketSize = max - min +1;
        int[] bucket = new int[bucketSize];

        for(int i=0; i<bucketSize; i++){
            bucket[i] = 0;
        }

        for(int i=0; i<size; i++){
            bucket[num[i]-min] ++;
        }

        int k = size - 1;
        for(int i=bucketSize-1; i>=0; i--){
            while(bucket[i] > 0){
                num[k--] = i + min;
                bucket[i] --;
            }
        }
    }
}
