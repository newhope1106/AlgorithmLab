package cn.appleye.algorithm.sort;

/**
 * @author charles on 2018/3/12
 * 归并排序
 */
public class MergeSort {
    public static void sort(int[] A, int[] B, int[] C){
        if(C.length < A.length + B.length){
            throw new IllegalArgumentException("the size of C is too small");
        }

        int i=0, j=0, k=0;

        while(i<A.length && j<B.length){
            if(A[i] < B[j]){
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        if(i<A.length){
            for(; i<A.length; i++){
                C[k++] = A[i];
            }
        }

        if(j<B.length){
            for(; j<B.length; j++){
                C[k++] = B[j];
            }
        }
    }
}
