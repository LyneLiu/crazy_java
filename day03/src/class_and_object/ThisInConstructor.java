/**
 * Created by Administrator on 2016/3/29.
 */
package class_and_object;

public class ThisInConstructor {
    //定义一个name为foo的成员变量
    public int foo;

    public ThisInConstructor() {
        //在构造器中定义一个foo变量
        int foo = 0;

        //使用this代表该构造器正在初始化的对象
        //通过this引用改变正在初始化的对象的成员变量foo初始化为6
        this.foo = 6;
    }

    public static void main(String[] args) {
        //所有通过构造器ThisInConstructor创建的对象foo成员变量都会被设置为6
        System.out.println(new ThisInConstructor().foo);
    }
}
