package cn.appleye.algorithm.test;

import cn.appleye.algorithm.search.BinarySearch;
import cn.appleye.algorithm.search.LinearSearch;
import cn.appleye.algorithm.sort.BubbleSort;
import cn.appleye.algorithm.util.LogUtil;
import cn.appleye.algorithm.util.NumberFactoryUtil;

/**
 * @author charles on 2018/3/12
 */
public class TestMain {
    public static void main(String[] args){
        int[] num = NumberFactoryUtil.create(new int[]{0, 100}, 11);
        LogUtil.printLog("排序前数组 : ", num);
        //BubbleSort.sortImp(num);
        LogUtil.printLog("排序后数组 : ", num);
        int value = num[NumberFactoryUtil.randomValue(num.length)];
        //int index = LinearSearch.search(num, value);
        int index = BinarySearch.search(num, value);
        LogUtil.printLog("找到数字:索引 -> " + value + " : " + index);
    }
}
