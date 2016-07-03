/**
 * Created by lyne on 16-7-3.
 */

class CacheImmutable{
    private static int MAX_SIZE = 10;

    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];

    private static int pos = 0;

    private final String name;

    public CacheImmutable(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    /**
     *  使用缓存的方式创建对象，将实例存储在堆内存中，提高特定场景的访问效率
     */
    public static CacheImmutable valueOf(String name){
        for (int i = 0;i<MAX_SIZE;i++){
            if (cache[i] != null && cache[i].getName().equals(name)){
                return cache[i];
            }
        }

        if (pos == MAX_SIZE){
            cache[0] = new CacheImmutable(name);
            pos = 1;
        }else{
            cache[pos++]  = new CacheImmutable(name);
        }

        return cache[pos -1];
    }

    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object != null && object.getClass() == CacheImmutable.class){
            CacheImmutable ci = (CacheImmutable)object;
            return this.name.equals(ci.getName());
        }

        return false;
    }

    public int hashCode(){
        return this.name.hashCode();
    }
}

public class CacheImmutableTest {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        CacheImmutable c1 = CacheImmutable.valueOf("Hello");
        CacheImmutable c2 = CacheImmutable.valueOf("Hello");

        System.out.println(c1 == c2);


        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println(str1 == str2);
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

}
