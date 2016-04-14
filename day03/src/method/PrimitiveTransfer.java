package method;

/**
 * Created by Administrator on 2016/3/29.
 */
public class PrimitiveTransfer {
    public static void swap(int a,int b){
        /*交换参数a和b的值*/
        int temp =a;
        a = b;
        b =temp;
        System.out.println("swap方法中，a的值是："+a
                +"；b的值是："+b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        PrimitiveTransfer.swap(a,b);
        System.out.println("交换结束后，a的值是："+a
                +"；b的值是："+b);
    }
}
