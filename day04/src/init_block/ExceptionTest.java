package init_block;

/**
 * Created by lyne on 16-6-25.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        int num = 0;
        try{
            if (num == 0){
                throw new Exception("test");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            if (num == 0){
                throw new MyException();
            }
        }catch (MyException e){
            e.say();
        }
    }

}
