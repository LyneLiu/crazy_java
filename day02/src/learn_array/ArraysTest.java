package learn_array;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/3/17.
 */
public class ArraysTest {

    public static void main(String[] args) {

        /*定义两个数组*/
        int[] a = {2,3,4,5};
        int[] b = {2,3,4,5};

        /*判断数组是否相同*/
        System.out.println("数组a和数组b的值是否相同："+ Arrays.equals(a,b));

        int[] c = Arrays.copyOf(a,6);
        System.out.println("数组a和数组c的值是否相同："+ Arrays.equals(a,c));

        System.out.println("数组c的元素为："+Arrays.toString(c));

        /*数组赋值fill*/
        Arrays.fill(c,2,4,0);
        System.out.println("数组c的元素为："+Arrays.toString(c));

        /*数组排序*/
        Arrays.sort(c);
        System.out.println("数组c的元素为："+Arrays.toString(c));

    }
}
