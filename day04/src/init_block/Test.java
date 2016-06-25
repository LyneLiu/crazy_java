package init_block;

/**
 * Created by lyne on 16-6-25.
 */

/**
 * 静态初始化块和构造器函数的执行顺序demo
 */

class Root{
    static {
        System.out.println("Root的static静态初始化块");
    }

    {
        System.out.println("Root的静态初始化块");
    }

    public Root(){
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid的static静态初始化块");
    }

    {
        System.out.println("Mid的静态初始化块");
    }

    public Mid(){
        System.out.println("Mid的无参构造器");
    }

    public Mid(String msg){
        this();
        System.out.println("Mid的有参构造器，其参数为："+msg);
    }

}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的static静态初始化块");
    }

    {
        System.out.println("Leaf的静态初始化块");
    }

    public Leaf(){
        super("父类Mid构造器");
        System.out.println("Leaf的无参构造器");
    }

}


public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
