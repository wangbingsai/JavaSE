package Class;

import java.lang.reflect.Constructor;

/**
 * @Author 空白
 * @Date 2021/9/18 20:39
 * @Version 1.0
 */
public class ConstructorTest {
    public static void main(String[] args)throws Exception {
        Class a = Class.forName("Class.User");
        //调用无参构造
        @Deprecated
        Object o = a.newInstance();
        //调用有参构造,因为构造方法名都相同所以第一个参数不用写方法名
        Constructor constructor = a.getConstructor(String.class, String.class, int.class, String.class,boolean.class);
        //调用newInstance方法创建有参构造创建对象
        Object o1 = constructor.newInstance("小明", "1", 123, "哈哈",true);
        System.out.println(o1);
    }
}
