/**
 * Created by Administrator on 2016/3/29.
 */
package class_and_object;

/**
 * Note：使用static修饰的方法和Filed，即可以通过类来调用，也可以通过实例来调用
 */
public class PersonTest {
    public static void main(String[] args) {

        //定义一个Person类型的变量
        Person p;
        //通过new关键字调用Person类的构造器
        //创建一个Person的实例并将其绑定至变量p
        p = new Person();

        //调用p的name Filed，并为该Filed赋值
        p.name = "lyne";
        //调用p的方法say
        p.say("Thinking in coding!");
        //直接输出p的name Filed的值
        System.out.println(p.name);
    }
}
