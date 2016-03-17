package learn_array;

/**
 * Created by Administrator on 2016/3/17.
 */
public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] a;

        /*必须通过关键自new才能动态初始化数组*/
        a = new int[4][];

        /*本质上数组变量是引用
        null
        null
        null
        null
        */
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        /*运行结果：
        0
        6
        */
        a[0] = new int[2];
        a[0][1]=6;
        for (int i =0;i<a[0].length;i++){
            System.out.println(a[0][i]);
        }
    }
}
