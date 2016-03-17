package learn_array;

/**
 * Created by Administrator on 2016/3/16.
 */
public class PrimitiveArrayTest {

    public static void main(String[] args) {
         /*
         定义一个int[]类型的数组变量，此时是空引用，并没有绑定对象的地址
         Note:引用类型的数据需要初始化之后才能使用！
         */
        int[] iArr;
        /*
        Error:(11, 28) java: 可能尚未初始化变量iArr
        System.out.println(iArr);
        */

        iArr = new int[5];

        for (int i = 0;i<5;i++){
            iArr[i] = i+10;
            System.out.println(iArr[i]);
        }
    }
}
