/**
 * Created by Administrator on 2016/3/29.
 */
package class_and_object;

/**
 * 类方法在实例化并调用run方法时会创建两个Dog实例，
 * 在不适用this引用的情况下通过创建一个实例来执行jump方法
 */
public class DogTest {
    public static void main(String[] args) {
        //创建Dog对象
        Dog dog = new Dog();
        //调用Dog的run方法
        dog.run();
    }
}
