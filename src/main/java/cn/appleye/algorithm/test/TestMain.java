package cn.appleye.algorithm.test;

import cn.appleye.algorithm.sort.*;
import cn.appleye.algorithm.util.LogUtil;
import cn.appleye.algorithm.util.NumberFactoryUtil;

/**
 * @author charles on 2018/3/12
 */
public class TestMain {
    public static void main(String[] args){
        int[] num = NumberFactoryUtil.create(new int[]{0, 100}, 10);
        LogUtil.printLog("排序前数组 : ", num);
        //BubbleSort.sortImp(num);
        //SelectSort.sort(num);
        //InsertSort.sort(num);
        HeapSort.sort(num);
        LogUtil.printLog("排序后数组 : ", num);
        //int value = num[NumberFactoryUtil.randomValue(num.length)];
        //int index = LinearSearch.search(num, value);
        //int index = BinarySearch.search(num, value);
        //LogUtil.printLog("找到数字:索引 -> " + value + " : " + index);

//        int[] A = NumberFactoryUtil.create(new int[]{0, 100}, 10);
//        InsertSort.sort(A);
//        int[] B = NumberFactoryUtil.create(new int[]{0, 100}, 9);
//        InsertSort.sort(B);
//        LogUtil.printLog("排序前数组A : ", A);
//        LogUtil.printLog("排序前数组B : ", B);
//        int[] C = new int[A.length + B.length];
//        MergeSort.sort(A, B, C);
//        LogUtil.printLog("排序后数组C : ", C);
    }
}
