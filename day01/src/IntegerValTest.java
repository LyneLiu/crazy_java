/**
 * Created by Administrator on 2016/3/14.
 */
public class IntegerValTest {
    public static void main(String[] args) {
        /**
         * byte类型数据
         */
        byte a = 56;

        /**
         * long类型的使用
         */
//      错误的使用：  long bigValue = 9999999999999;
        long bigValue2 = 9999_9999_9999_9L;
        System.out.println("byte value:" + a);
        System.out.println("long value:" + bigValue2);

        /*八进制以0开头*/
        int octalValue = 010;
        System.out.println("octal value:" + octalValue);

        /*十六进制以0x或者0X开头*/
        int hexValue1 = 0x12;
        int hexValue2 = 0X13;
        System.out.println("hex value 1:" + hexValue1);
        System.out.println("hex value 2:" + hexValue2);

        /*二进制以0b或0B开头*/
        int binVal1 = 0b1101_0100;
        byte binVal2 = 0B011_01001;
        /*定义一个32位的二进制整数，最高位是符号位*/
        int binVal3 = 0B1000_0000_0000_0000_0000_0000_0000_0011;
        System.out.println("binary value 1:" + binVal1);
        System.out.println("binary value 1:" + binVal2);
        System.out.println("binary value 1:" + binVal3);

        /*定义一个八位的二进制数，该数值默认是32位的，因此它是一个整数
        * 强制类型转换成byte时会发生溢出，最终编程赋值
        */
        byte binVal4 = (byte) 0b1110_1001;
        /*定义一个32位的二进制数，最高位是1
        * 但是数值后边添加L后缀，所以该整数实际占位为64位，binVal5的值为正数
        */
        long binVal5 = 0B1000_0000_0000_0000_0000_0000_0000_0011L;
        System.out.println("byte强制类型转换发生溢出：" + binVal4);
        System.out.println("默认数值添加L后缀，32位二进制转换为64位整数，未溢出：" + binVal5);
    }
}
