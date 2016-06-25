package init_block;

/**
 * Created by lyne on 16-6-25.
 */
public class Person {

    /*初始化块隐式执行（按照顺序）*/
    {
        int a = 6;
        if (a > 4){
            System.out.println("init block, a is bigger than 4.");
        }

        System.out.println("Person的第一个初始化块。");
    }

    {
        System.out.println("Person的第二个初始化块。");
    }

    public Person(){
        System.out.println("Person的无参构造器。");
    }


    public static void main(String[] args) {
        new Person();
    }

}
