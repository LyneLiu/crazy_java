package interface_demo;

/**
 * Created by lyne on 16-7-7.
 */
public class AddCommand  implements  Command{
    @Override
    public void process(int[] target) {
        int sum=0;
        for (int tmp:target) {
            sum+=tmp;
        }
        System.out.println("Sum:"+sum);
    }
}
