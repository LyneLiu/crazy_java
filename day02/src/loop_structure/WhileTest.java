package loop_structure;

/**
 * Created by Administrator on 2016/3/15.
 */
public class WhileTest {
    public static void main(String[] args) {

        /*循环的初始化语句*/
        int count = 0;
        /*循环条件: count < 10*/
        while (count < 10){
            System.out.println("current count value:"+count);
            /*迭代语句*/
            count++;
        }

        System.out.println("循环结束！");

    }
}
