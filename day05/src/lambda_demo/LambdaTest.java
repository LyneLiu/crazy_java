package lambda_demo;

/**
 * Created by lyne on 16-7-10.
 */

/**
 * Lambda表达式的目标类型必须是明确的函数式接口
 * Lambda表达式只能为函数式接口创建对象
 *
 * Note：函数式接口只能声明一个抽象方法！！！
 */
public class LambdaTest {
    public static void main(String[] args) {

        /*Test1*/
        Runnable r = ()->{
            System.out.println("functional interface.");
        };

        r.run();
        /*Test2，错误提示：target type of lambda conversion must be an interface"*/
        /*Object o = ()->{
            System..println("lambda to object test.");
        };*/
    }
}