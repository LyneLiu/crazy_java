package loop_structure;

/**
 * Created by Administrator on 2016/3/15.
 */
public class DoWhileTest {

    public static void main(String[] args) {

        /*初始化变量*/
        int count1 = 1;
        do {
            System.out.println("current count1 value:"+count1);
            count1++;
        }while (count1 < 10);

        System.out.println("count1 loop over!");

        /*初始化变量*/
        int count2 = 20;
        /*do...while循环语句至少会执行一次循环体*/
        do {
            System.out.println("current count2 value:"+count2);
            count1++;
        }while (count2 < 10);

        System.out.println("count2 loop over!");
    }
}
