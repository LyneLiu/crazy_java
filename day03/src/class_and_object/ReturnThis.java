/**
 * Created by Administrator on 2016/3/29.
 */
package class_and_object;

public class ReturnThis {
    public int age = 0;

    public ReturnThis grow() {
        this.age++;
        // 将this作为普通方法的返回值
        return this;
    }

    public static void main(String[] args) {
        ReturnThis returnThis = new ReturnThis();
        //可以连续调用同一方法
        returnThis.grow()
                .grow()
                .grow();
        System.out.println("returnThis的age值为"+returnThis.age);
    }
}
