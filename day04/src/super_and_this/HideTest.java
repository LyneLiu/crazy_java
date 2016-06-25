package super_and_this;

/**
 * Created by lyne on 16-6-24.
 */

class Parent{

    public String tag = "parent tag";

}

class Child extends Parent{

    public String tag = "child tag";

}

public class HideTest {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.tag);

        Parent parent = (Parent)child;
        System.out.println(parent.tag);
    }


}
