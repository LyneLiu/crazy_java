package learn_array;

/**
 * Created by Administrator on 2016/3/17.
 */

public class ReferenceArrayTest {

    public static void main(String[] args) {

        /*定义一个students数组变量，其类型是Person*/
        Person[] students = new Person[2];

        /*创建两个Person对象*/
        Person zhang = new Person();
        zhang.setAge(15);
        zhang.setHeight(158);

        Person lee = new Person();
        lee.setAge(24);
        lee.setHeight(180);

        students[0] = zhang;
        students[1] = lee;

        /*数组元素的对象与引用lee的对象相同*/
        lee.info();
        students[1].info();

        System.out.println(students);
        System.out.println(zhang);
        System.out.println(students[0]);
        System.out.println(lee);
        System.out.println(students[1]);
    }
}
