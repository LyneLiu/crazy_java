package learn_array;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/3/17.
 */
public class ArraysTest2 {

    /*Java 8新添加的特性*/
    public static void main(String[] args) {

        int[] arr1 = new int[]{3,-4,25,16,30,18};
        /*数组并发排序*/
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{3,-4,25,16,30,18};
        Arrays.parallelPrefix(arr2,new IntBinaryOperator(){
            public int applayAsInt(int left,int right){
                return left * right;
            }
        });
        System.out.println(Arrays.toString(arr2));

        /*parallelSetAll类似于Erlang的map功能*/
        int[] arr3 = new int[5];
        Arrays.parallelSetAll(arr2,new IntUnaryOperator(){
            public int applayAsInt(int operand){
                return operand * 5;
            }
        });
        System.out.println(Arrays.toString(arr3));


    }
}
