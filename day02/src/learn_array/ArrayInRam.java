package learn_array;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ArrayInRam {
    public static void main(String[] args) {
        /*定义并初始化数组，使用静态初始化*/
        int[] arrayA = new int[]{5, 7, 20};

        /*定义并初始化数组，使用动态初始化*/
        int[] arrayB = new int[4];

        System.out.println(arrayA);     /*结果：[I@3067ed13*/
        System.out.println(arrayB);     /*结果：[I@6139cf9c*/

        System.out.println("length of arrayB:" + arrayB.length);
        /*访问数组arrayA中的数组元素*/
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        /*访问数组arrayB中的数组元素*/
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }

        /*将数组引用变量arrayA赋值给arrayB*/
        arrayB = arrayA;
        /*再次访问数组arrayB中的数组长度*/
        System.out.println("length of arrayB:" + arrayB.length);

        System.out.println(arrayA);     /*结果：[I@3067ed13*/
        System.out.println(arrayB);     /*结果：[I@3067ed13*/
    }
}
