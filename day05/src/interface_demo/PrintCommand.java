package interface_demo;

/**
 * Created by lyne on 16-7-7.
 */
public class PrintCommand implements Command {

    @Override
    public void process(int[] target) {
        for (int num:target) {
            System.out.println(num);
        }
    }
}
