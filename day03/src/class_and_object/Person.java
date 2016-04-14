/**
 * Created by Administrator on 2016/3/28.
 */
package class_and_object;

/**
 * 类和对象的学习
 * 1、Field
 * 2、方法
 * 3、构造器
 * Note：static主要用来区分Field和方法是属于类，还是属于对象实例
 */
public class Person {

    //定义两个Field
    public String name;
    public int age;

    //定义一个say方法
    public void say(String content){
        System.out.println(content);
    }
}
