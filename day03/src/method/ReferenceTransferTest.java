package method;

/**
 * Created by Administrator on 2016/3/29.
 */

/**
 * Java的参数传递方式是传值，当将引用类型作为参数类型时，传递的同样是值，即引用中的地址
 */
public class ReferenceTransferTest {

    public static void swap(DataWrap dw) {
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;
        System.out.println("swap方法中，a成员变量的值是：" + dw.a
                + "；b成员变量的值是：" + dw.b);
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束后，a成员变量的值是："+dw.a
                +"；b成员变量的值是："+dw.b);
    }
}

class DataWrap {
    int a;
    int b;
}
