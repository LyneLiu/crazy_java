package loop_control;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ContinueTest {
    public static void main(String[] args) {
        /*一个简单的for循环*/
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("test 2>>>>number:" + i);
            } else {
                /*使用continue控制循环*/
                continue;
            }
        }

        /*一个简单的for嵌套循环*/
        System.out.println("continue with the tag:");
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 3; j++) {
                System.out.println("i value:" + i + " j value:" + j);
                if (j == 1) {
                    /*通过标签控制continue的循环范围，
                    这种使用情况类似于默认的break控制内层循环*/
                    continue outer;
                }
            }
        }
    }
}
