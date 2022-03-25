package Class;

import java.util.Date;

/**
 * @Author 空白
 * @Date 2021/9/13 18:27
 * @Version 1.0
 */
public class getClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Date date = new Date();
        Class aClass = date.getClass();
        System.out.println(aClass.getName());
        Class<? extends String> aClass1 = "a".getClass();
        Class<?> aClass2 = Class.forName("java.util.Date");
        Class<Date> dateClass = Date.class;

    }
}
