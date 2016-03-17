package learn_array;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ForEachErrorTest {
    public static void main(String[] args) {
        String[] books = new String[]{
                "轻量级Java EE企业应用实战",
                "疯狂Java讲义",
                "疯狂Android讲义"
        };

        /*通过foreach循环访问数组元素时，通常不需要对循环变量进行赋值*/
        for (String book : books
                ) {
//            book = "Erlang程序设计语言";
            books[1] ="Erlang程序设计语言";
            System.out.println(book);
        }
    }
}
