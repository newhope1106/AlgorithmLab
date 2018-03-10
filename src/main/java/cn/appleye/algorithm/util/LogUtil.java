package cn.appleye.algorithm.util;

/**
 * @author charles on 2018/3/10
 */
public class LogUtil {
    public static boolean LOGGABLE = true;

    public static void printLog(String pre, int num){
        if(LOGGABLE){
            System.out.println(pre + num);
        }
    }

    public static void printLog(String pre, int[] num){
        if(LOGGABLE){
            System.out.print(pre);

            for(int value : num){
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }
}
