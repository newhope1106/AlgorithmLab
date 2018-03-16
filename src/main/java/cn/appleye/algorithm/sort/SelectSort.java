package cn.appleye.algorithm.sort;

/**
 * @author charles on 2018/3/12
 * 选择排序
 */
public class SelectSort {
    public static void sort(int[] num){
        int size = num.length;
        for(int i=0; i<size; i++){
            int index = i;
            for(int j=i+1; j<size; j++){
                if(num[j] < num[index]){
                    index = j;
                }
            }

            if(index != i){
                int temp = num[i];
                num[i] = num[index];
                num[index] = temp;
            }
        }
    }
}
