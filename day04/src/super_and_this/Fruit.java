package super_and_this;

/**
 * Created by lyne on 16-6-23.
 */
public class Fruit {

    private String name;

    public Fruit(){

    }

    public Fruit(String name){
        this.name = name;
    }

    public void say(){
        System.out.println(this.name);
    }
}
