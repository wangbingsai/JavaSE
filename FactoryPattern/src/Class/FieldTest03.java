package Class;

import java.lang.reflect.Field;

/**
 * @Author 空白
 * @Date 2021/9/14 22:02
 * @Version 1.0
 */
public class FieldTest03 {
    public static void main(String[] args) throws Exception {
        Class user = Class.forName("Class.User");
        Object o = user.newInstance();
        Field age = user.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,132);
        Object o1 = age.get(o);
        System.out.println(o1);
        Object o2 = new Object();
        System.out.println(o2);
    }
}
