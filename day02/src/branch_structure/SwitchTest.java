package branch_structure;

/**
 * Created by Administrator on 2016/3/14.
 */

/**
 * switch语句后面的控制表达是的数据类型可以是以下其中的一种：
 * 1、byte
 * 2、short
 * 3、char
 * 4、int
 * 5、枚举类型
 * 6、java.lang.String
 * Note：不能是boolean类型
 */
public class SwitchTest {
    public static void main(String[] args) {
        /*成绩的判定输出*/
        char score = 'C';

        /*注意break的使用！*/
        switch (score){
            case 'A':
                System.out.println("优秀");
//                break;
            case 'B':
                System.out.println("良好");
//                break;
            case 'C':
                System.out.println("中");
//                break;
            case 'D':
                System.out.println("不及格");
//                break;
            default:
                System.out.println("请输入正确的成绩格式");
                break;
        }

        System.out.println("成绩判定的switch方法测试结束。");
    }
}
