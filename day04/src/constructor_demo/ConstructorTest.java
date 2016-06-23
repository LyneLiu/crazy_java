package constructor_demo;

/**
 * Created by lyne on 16-6-22.
 */
public class ConstructorTest<T> {

    private T name;
    private int count;

    /*重构class构造函数的时候，需要添加默认的构造函数*/
    ConstructorTest(){

    }

    ConstructorTest(T name,int count){

        this.name = name;

        if (count < 10){
            this.count = 10;
        }else{
            this.count = count;
        }
    }

    public T getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ConstructorTest ct = new ConstructorTest(12,2);
        System.out.println(ct.getName());
        System.out.println(ct.getCount());
        System.out.println(ct.getClass());
    }

}
