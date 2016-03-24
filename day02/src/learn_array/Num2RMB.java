package learn_array;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/3/24.
 * 将一个浮点数转换成人民币读法的字符串
 */

public class Num2RMB {

    private String[] hanArr = {"零", "壹", "貳", "叁", "肆", "伍",
            "陆", "柒", "捌", "玖"};

    private String[] unitArr = {"万","千", "百", "十"};

    /**
     * 讲一个浮点数分解为整数部分和小数部分
     *
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数部分和小数部分，第一个数组元素是整数部分，第二个数组元素是小数部分
     */
    private String[] divide(double num) {

        long zheng = (long) num;
        long xiao = Math.round((num - zheng) * 100);

        return new String[]{zheng + "", String.valueOf(xiao)};
    }

    /**
     * 将整数转换为汉字字符串
     * @param numStr 需要被转换的整数
     * @return
     */
    private String toHanStr(String numStr) {
        String result = "";
        int numLen = numStr.length();

        for (int i = 0; i < numLen; i++) {
            int num = numStr.charAt(i) - 48;
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen + i - 5];
            }else {
                result +=hanArr[num];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Num2RMB num2RMB = new Num2RMB();

        System.out.println(Arrays.toString(num2RMB.divide(123.456)));

        System.out.println(num2RMB.toHanStr("92345"));

    }
}
