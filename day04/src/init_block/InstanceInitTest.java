package init_block;

/**
 * Created by lyne on 16-6-25.
 */
public class InstanceInitTest {

    /*初始化块在成员变量前执行，不需要提前声明吗？*/
    {
        a = 6;
    }

    int a = 9;

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);   // 结果为：9
    }
}
