import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author 空白
 * @Date 2021/8/30 21:53
 * @Version 1.0
 */
public class CollectionTest {

    public static void main(String[] args) {
        Collection arr =  new ArrayList();
        arr.add(100);//自动装箱 Integer a = new Integer(100);存的是a的内存地址
        arr.add(new Object());
        arr.add(false);//自动装箱
        System.out.println(arr.contains(""));
        Iterator i = arr.iterator();
        System.out.println(i.hasNext());//打印true
        System.out.println(i.next());//打印100
    }


}
