/**
 * Created by Administrator on 2016/3/14.
 */
public class FloatTest {
    public static void main(String[] args) {
        float af = 5.2345556f;
        System.out.println("af值是否发生变化？" + af);
        double a = 0.0;
        double b = Double.NEGATIVE_INFINITY;
        float c = Float.NEGATIVE_INFINITY;
        /*float和double的负无穷大是相等的*/
        System.out.println("负无穷大相等："+(b == c));
        /*0.0 / 0.0将得到非数NaN*/
        System.out.println("非数：" + a / a);
        /*两个非数NaN之间是不相等的！*/
        System.out.println("非数不相等：" + (a / a == Float.NaN));
        /*所有的正无穷大是相等的,自动类型转换将0装换为0.0!*/
        System.out.println(6.0/0== 5.0/0);
        /*负数除以0.0得到负无穷大*/
        System.out.println(-8/a);
        /*异常情况：0除以0将会发生异常*/
        System.out.println(0/0);
    }
}
