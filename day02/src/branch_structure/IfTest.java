package branch_structure;

/**
 * Created by Administrator on 2016/3/14.
 */
public class IfTest {
    public static void main(String[] args) {
        int age = 30;
        /*只有当age > 20时，下面花括号括起来的代码块才能执行*/
        if (age > 20){
            System.out.println("年龄大于20岁了！");
            System.out.println("20岁以上的年轻人应该学会责任和担当...");
        }

        System.out.println("This is a if" +
                " structure test.");
    }
}
