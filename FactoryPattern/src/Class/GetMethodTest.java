package Class;

import java.lang.reflect.Method;

/**
 * @Author 空白
 * @Date 2021/9/17 22:40
 * @Version 1.0
 */
public class GetMethodTest {
    public static void main(String[] args) throws Exception{
        Class mt1 = Class.forName("Class.MethodTest01");
        Object o = mt1.newInstance();
        Method[] declaredMethods = mt1.getDeclaredMethods();
        for (Method  method : declaredMethods){
            System.out.println(method.getName());
            Class returnType = method.getReturnType();
            System.out.println(returnType.getSimpleName());
        }
        Method declaredMethod = mt1.getDeclaredMethod("m1", int.class,String.class);
        System.out.println(declaredMethod.invoke(o,123, "admin"));

    }
}
class MethodTest01{
    public boolean m1(int a,String str){
        if (a==123&&str.equals("admin")) {
            return true;
        }
        return false;
    }
    public int m2(int a,String str){
     return 1;
    }
    public void m3(int a,String str){

    }
}
