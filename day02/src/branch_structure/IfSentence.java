package branch_structure;

import java.util.Scanner;

public class IfSentence {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, max = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("输入第一个整数：");
        a = reader.nextInt();
        System.out.println("输入第二个整数：");
        b = reader.nextInt();
        System.out.println("输入第三个整数：");
        c = reader.nextInt();
        if(a > b){
            max = a;
            if (a < c){
                max = c;
            }
        }else {
            max  =b;
            if (b < c){
                max = c;
            }
        }

        System.out.println(max);
    }

}
