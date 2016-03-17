package loop_control;

/**
 * Created by Administrator on 2016/3/16.
 */
public class BreakTest {
    public static void main(String[] args) {
        /*一个简单的for循环*/
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("test 1>>>>number:" + i);
            } else {
                /*使用break控制循环*/
                break;
            }
        }

         /*一个简单的for循环*/
        for (int i = 0; i < 10; i++) {
            System.out.println("test 1>>>>number:" + i);
            if (i == 2) {/*使用break控制循环,
            break语句不仅可以结束其所在的循环，
            还可以直接结束其外层循环！*/
                break;
            }
        }

        /*一个简单的for嵌套循环*/
        System.out.println("default break range:");
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 3; j++) {
                System.out.println("i value:" + i + " j value:" + j);
                if (j == 2) {
                    /*默认控制的范围？？？结束最近范围的循环，等同于使用标签时的 break inner;*/
                    break;
                }
            }
        }

        /*一个简单的for嵌套循环*/
        System.out.println("break with the tag:");
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 3; j++) {
                System.out.println("i value:" + i + " j value:" + j);
                if (j ==2 ) {
                    /*通过标签控制break的循环范围*/
                    break outer;
                }
            }
        }
    }
}
