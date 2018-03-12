package cn.appleye.algorithm.search;

/**
 * @author Liu Liaopu
 * @date 2018-03-09
 * @description : 二分查找，从排序好的超找数字，返回索引
 */
public class BinarySearch {
    /**
     * 搜索
     * */
    public static int search(int[] num, int value){
        int min = 0; int max = num.length-1;
        int mid = (min+max)/2;
        int index = -1;

        while(mid>=min && mid<=max){
            if(num[mid] == value){
                index = mid;
                break;
            } else if(num[mid] > value){
                max = mid-1;
                mid = (min + max)/2;
            } else{
                min = mid + 1;
                mid = (min+max)/2;
            }
        }

        return index;
    }
}
