/**
 * Created by Administrator on 2016/3/29.
 */
package class_and_object;

/**
 * Note：通常所说的使用static修饰的静态方法不能直接
 * 访问非静态方法，主要是因为方法和成员的调用通常使用this引用调用，
 * 一个是属于类，一个是属于对象实例，当通过类的方法调用实例的方法时，
 * 容易无法找到合适的对象产生错误！！！

 */
public class StaticAccessNonStatic {

    public void info(){
        System.out.println("this is a static_access_nonstatic test.");
    }

    public static void main(String[] args) {

        // Error:(10, 9) java: 无法从静态上下文中引用非静态 方法 info()

        //  info();

        //需要通过对象实例进行引用，正确的方法如下：
        StaticAccessNonStatic staticAccessNonStatic = new StaticAccessNonStatic();
        staticAccessNonStatic.info();

    }
}
