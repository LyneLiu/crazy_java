package interface_demo;

/**
 * Created by lyne on 16-7-3.
 */

interface Product{
    int getProductTime();
}

public class Printer implements Output, Product{

    private String[] printData = new String[MAX_CACHE_LINE];

    private int dataNum = 0;

    @Override
    public void out() {
        while (dataNum > 0){
            System.out.println("打印机打印："+printData[0]);
            System.arraycopy(printData,1,printData,0,--dataNum);
        }
    }

    @Override
    public void getData(String msg) {

        if (dataNum >= MAX_CACHE_LINE){
            System.out.println("打印队列已满，添加失败");
        }else{
            printData[dataNum++] = msg;
        }

    }

    @Override
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("luffy");
        o.getData("zoro");
        o.out();
        o.print("nice","day","be","happy");
        o.test();

        Product p = new Printer();
        System.out.println(p.getProductTime());
    }
}
