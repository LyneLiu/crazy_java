package learn_array;

/**
 * Created by Administrator on 2016/3/17.
 */
/*定义一个Person类*/
public class Person{
    private int age;    //年龄
    private double height;  //身高

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void info(){
        System.out.println("age:"+age+" height"+height);
    }
}

