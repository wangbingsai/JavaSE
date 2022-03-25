package Annotation.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author 空白
 * @Date 2021/9/19 23:41
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Annotation.Annotations.ReMyAnnotationTest");
        Method doSome = c.getDeclaredMethod("doSome");
        if (doSome.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = doSome.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.age());
            System.out.println(annotation.addrad());

        }
        if (c.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
            System.out.println(annotation.addrad());

        }
    }
}
