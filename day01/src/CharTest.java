/**
 * Created by Administrator on 2016/3/14.
 */
public class CharTest {
    public static void main(String[] args) {
        /*直接指定单个字符作为字符值*/
        char aChar = 'a';
        /*使用转义字符作为字符值*/
        char enterChar = '\r';
        /*使用Unicode编码值指定字符值*/
        char ch = '\u9999';
        System.out.println("aChar :" + aChar);
        System.out.println("enterChar :" + enterChar);
        System.out.println("ch :" + ch);

        /*直接讲一个char变量当成int类型使用*/
        char zhong = '乐';
        int zhongValue = zhong;
        System.out.println("zhong:" + zhong);
        System.out.println("zhongValue:" + zhongValue);

        /*直接把0~65535范围内的int整数赋给一个char变量*/
        char c = 97;
        System.out.println("c:" + c);
    }
}
