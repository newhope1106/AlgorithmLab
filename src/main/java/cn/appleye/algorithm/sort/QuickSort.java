package cn.appleye.algorithm.sort;

/**
 * @author charles on 2018/3/12
 * 快速排序
 */
public class QuickSort {

    public static void sort(int[] num){
        int size = num.length;
        split(0, size-1, num);
    }

    private static void split(int low, int high, int[] num){
        if(low >= high){
            return;
        }

        int i=low+1, j= high, index = low;
        while(i<=j){
            while(i<=j){
                if(num[j] < num[index]){
                    int temp = num[index];
                    num[index] = num[j];
                    num[j] = temp;
                    index = j;
                    j--;
                    break;
                }

                j--;
            }

            while(i<=j){
                if(num[i] > num[index]){
                    int temp = num[index];
                    num[index] = num[i];
                    num[i] = temp;
                    index = i;
                    i++;
                    break;
                }
                i++;
            }
        }

        split(low, index-1, num);
        split(index + 1, high, num);
    }
}
