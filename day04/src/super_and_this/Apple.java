package super_and_this;

/**
 * Created by lyne on 16-6-23.
 */
public class Apple extends Fruit {

    private String category;

    private int num;

    public Apple(String name,String category){
        super(name);
        this.category = category;
    }

    public Apple(int num,String name,String category){
        this(name,category);
        this.num = num;
    }

    public void say(){
        super.say();
        System.out.println("the child!");
        if (num > 0){
            System.out.println(num);
        }

        if (category != null){
            System.out.println(category);
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple("A","good");
        apple.say();


        Apple testApple = new Apple(2,"B","bad");
        testApple.say();
    }
}
