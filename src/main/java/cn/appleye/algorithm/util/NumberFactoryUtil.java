package cn.appleye.algorithm.util;

/**
 * @author charles on 2018/3/10
 * 生成随机数
 */
public class NumberFactoryUtil {

    /**
     * 生成随机数字数组
     * @param range 范围
     * @param size 大小
     * */
    public static int[] create(int[] range, int size){
        if(range == null || range.length != 2){
            throw new IllegalArgumentException("range is invalid");
        }

        if(size < 1){
            throw new IllegalArgumentException("size is invalid");
        }

        int min = range[0];
        int gap = range[1] - min;

        int[] num = new int[size];
        for(int i=0; i<size; i++){
            num[i] = min + (int)(Math.random()*gap);
        }

        return num;
    }

    /**
     * 生成随机数
     * */
    public static int randomValue(int[] range){
        int min = range[0];
        int gap = range[1] - min;
        return min + (int)(Math.random()*gap);
    }

    /**
     * 生成随机数
     * */
    public static int randomValue(int max){
        return randomValue(new int[]{0, max});
    }
}
