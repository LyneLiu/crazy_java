/**
 * Created by Administrator on 2016/3/14.
 */
public class RandomStr {
    public static void main(String[] args) {
        /*初始化*/
        String result = "";
        /*获取一个随机验证码*/
        for (int i =0;i<5;i++){
            int intVal = (int)(Math.random() * 26 + 65);

            result = result + (char)intVal;
        }
        System.out.println(result);
    }
}
