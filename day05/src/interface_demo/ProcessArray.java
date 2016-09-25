package interface_demo;

/**
 * Created by lyne on 16-7-7.
 */
public class ProcessArray {

    public void process(int[] target,Command cmd) {
        cmd.process(target);
    }

    public static void main(String[] args) {
        ProcessArray processArray  =new ProcessArray();
        int[] arr = {3,-4,6,4};
        processArray.process(arr,new PrintCommand());

        System.out.println("+++++++++++++++++++++++++");
        processArray.process(arr,new AddCommand());

        /*java 8 lambda表达式方法:函数式接口FunctionalInterface*/
        processArray.process(arr,(int[] target) ->{
            int sum = 0;
            for (int num:
                 target) {
                sum += num;
            }
            System.out.println("sum:"+sum);
        });

        //LambdaMethodRef lambdaMethodRef = (from) -> Integer.valueOf(from);

        //引用类方法实现lambda表达式的目标类型转换
        LambdaMethodRef lambdaMethodRef = Integer::valueOf;


    }
}
