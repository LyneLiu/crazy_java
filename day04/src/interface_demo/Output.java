package interface_demo;

/**
 * Created by lyne on 16-7-3.
 */
public interface Output{
    /*接口成员变量*/
    int MAX_CACHE_LINE = 50;
    /*接口方法*/
    void out();
    void getData(String msg);

    default void print(String... msgs){
        for (String msg:msgs) {
            System.out.println(msg);
        }
    }

    default void test(){
        System.out.println("默认的test()方法");
    }

    static String staticTest(){
        return "接口中的类方法";
    }
}
