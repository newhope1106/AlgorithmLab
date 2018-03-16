package cn.appleye.algorithm.sort;

/**
 * @author charles on 2018/3/12
 * 希尔排序
 */
public class HillSort {
    public static void sort(int[] num){
        int size = num.length;
        int step = size/2;

        while(step > 0){
            for(int i=0; i+step<size; i++){
                int j=i;
                while(j+step<size){
                    if(num[j] > num[j+step]){
                        int temp = num[j];
                        num[j] = num[j+step];
                        num[j+step] = temp;
                    }

                    j += step;
                }
            }

            step /=2;
        }
    }
}
