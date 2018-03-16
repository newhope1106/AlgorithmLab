package cn.appleye.algorithm.sort;

/**
 * @author charles on 2018/3/12
 * 插入排序
 */
public class InsertSort {

    public static void sort(int[] num){
        int size = num.length;

        for(int i=1; i<size; i++){
            for(int j=i; j>0; j--){
                if(num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
