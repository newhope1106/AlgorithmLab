package cn.appleye.algorithm.sort;

import cn.appleye.algorithm.util.LogUtil;

/**
 * @author charles on 2018/3/12
 * 堆排序
 */
public class HeapSort {
    public static void sort(int[] num){
        int size = num.length;
        if(size <=1){
            return;
        }

        makeHeap(num);

        int index = size -1;
        while(index > 0){
            int temp = num[index];
            num[index] = num[0];
            num[0] = temp;

            shiftDown(num, 0, index);

            index--;
        }
    }

    /**
     * 构建堆
     * */
    private static void makeHeap(int[] num){
        int size = num.length;

        int index = (size-1)/2;

        while(index >= 0){
            shiftDown(num, index, size);

            index --;
        }
    }

    private static void shiftDown(int[] num, int parentIndex, int length){
        int childIndex = parentIndex*2+1;
        while(childIndex < length){
            if(childIndex+1<length && num[childIndex] < num[childIndex+1]){
                childIndex ++;
            }

            if(num[parentIndex] < num[childIndex]){
                int temp = num[parentIndex];
                num[parentIndex] = num[childIndex];
                num[childIndex] = temp;
            } else {
                break;
            }

            parentIndex = childIndex;
            childIndex = parentIndex*2 + 1;
        }
    }
}
