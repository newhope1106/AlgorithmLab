package cn.appleye.algorithm.search;

/**
 * @author Liu Liaopu
 * @date 2018-03-09
 * @description 线性查找
 */
public class LinearSearch {
    public static int search(int[] num, int value){
        int index = -1;
        int length = num.length;
        for(int i=0; i<length; i++){
            if(num[i] == value){
                index = i;
                break;
            }
        }

        return index;
    }
}
