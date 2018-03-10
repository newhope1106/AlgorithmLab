package cn.appleye.algorithm.sort;

/**
 * @author Liu Liaopu
 * @date 2018-03-09
 * @description : 冒泡排序
 */
public class BubbleSort {
    /**
     * 原始冒泡排序
     * */
    public static void sort(int[] num){
        int size = num.length;

        for(int i=0; i<size; i++){
            for(int j=1; j<size; j++){
                if(num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
    }

    /**
     * 改进的冒泡排序
     * */
    public static void sortImp(int[] num){
        int size = num.length;

        for(int i=size; i>0; i--){
            for(int j=1; j<i; j++){
                if(num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
    }
}
