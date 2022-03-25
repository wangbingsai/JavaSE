package Class;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author 空白
 * @Date 2021/9/14 20:15
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class user = Class.forName("Class.User");
        System.out.println(user.getSimpleName());
        System.out.println(user.getName());
        Field[] fields = user.getDeclaredFields();
        String u1 = user.getSimpleName();
        System.out.println(u1);//打印User
        int modifiers = user.getModifiers();

        for (Field f: fields) {
         /*   System.out.println(f.getName());
            System.out.println(f.toString());*/
           /* Class type = f.getType();
            System.out.println(type.getName());*/
            int  i =f.getModifiers();
            System.out.println(Modifier.toString(i));

        }
    }
}
