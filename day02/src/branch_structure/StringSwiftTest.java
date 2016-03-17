package branch_structure;

/**
 * Created by Administrator on 2016/3/15.
 */
public class StringSwiftTest {
    public static void main(String[] args) {

        /*Java 7添加的新特性：switch添加String的支持*/
        String season = "夏天";

        switch (season) {
            case "春天":
                System.out.println("春暖花开。");
                break;
            case "夏天":
                System.out.println("夏日炎炎。");
                break;
            case "秋天":
                System.out.println("秋高气爽。");
                break;
            case "冬天":
                System.out.println("白雪皑皑。");
                break;
            default:
                System.out.println("季节输入错误！");
                break;
        }
    }
}
