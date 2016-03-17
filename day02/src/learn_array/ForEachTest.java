package learn_array;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ForEachTest {

    public static void main(String[] args) {
        String[] books = new String[]{
                "轻量级Java EE企业应用实战",
                "疯狂Java讲义",
                "疯狂Android讲义"
        };

        /*通过foreach循环访问数组中的数据元素*/
        for (String book : books
                ) {
            System.out.println(book);
        }
    }
}
