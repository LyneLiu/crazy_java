package learn_array;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ArrayTest {
    public static void main(String[] args) {
        /*
        数组中的数组元素需要是同种类型！
        两种初始化方法：
        1、静态初始化
        2、动态初始化
        */

        /*定义一个int数组类型的变量*/
        int[] intArray;

        /*通过静态初始化的方法为数组变量赋值*/
        intArray = new int[]{4,1,7,2,5};

        /*定义一个Object数组类型的变量*/
        Object[] objArray;

        /*静态初始化，可以将数组元素类型的子类赋值给数组*/
        objArray = new String[]{"Java","Lyne"};

        Object[] objArray2;
        objArray2 = new Object[]{"Erlang","Lyne"};

        System.out.println(objArray[0]);
        objArray2[0] = "Spark";
        System.out.println(objArray2[0]);
    }
}
