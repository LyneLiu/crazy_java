/**
 * Created by Administrator on 2016/3/29.
 */
package class_and_object;

/**
 * 关键字this引用的使用（均指向实例对象）
 * 1、在构造器中使用表示引用该构造器正在初始化的对象
 * 2、在方法中使用表示引用该方法的对象
 */
public class Dog {

    //定义一个jump方法
    public void jump(){
        System.out.println("the dog jumps!");
    }

    //定义一个run方法，该方法需要借助jump方法
    public void run(){
        /*Dog d = new Dog();
        d.jump();*/
        //通过this引用的方法替代上述创建对象的方法
        this.jump();
        System.out.println("the dog is running!");
    }
}
