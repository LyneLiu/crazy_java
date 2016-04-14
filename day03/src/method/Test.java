package method;


import java.util.Scanner;

/**
 * Created by Administrator on 2016/3/31.
 */
public class Test {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner reader = new Scanner(System.in);
        // 循环执行计算求和
        do{
            //每次sum的值需要初始化为0
            sum=0;
            //每次b的值需要初始化为1
            b=1;
            System.out.println("请输入整数");
            a=reader.nextInt();
            if (50>a||a>100){
                //如果不满足进入下一次循环
                continue;
            }else{
                //满足条件的求和运算
                do {
                    sum = sum+b;
                    b++;
                }while(b<=a);
                System.out.println("sum的值为"+sum);
            }
        }while (true);
    }
}
