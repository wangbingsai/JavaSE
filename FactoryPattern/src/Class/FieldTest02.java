package Class;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author 空白
 * @Date 2021/9/14 21:25
 * @Version 1.0
 */
public class FieldTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //加载类
        Class user = Class.forName("java.util.Date");
        //创建字符串追加对象
        StringBuffer sb = new StringBuffer();
        //获取类的访问修饰符和类名
        sb.append(Modifier.toString(user.getModifiers())+ " "+"class "+user.getSimpleName()+"{\n");
        //获取类中所有属性
        Field[] files = user.getDeclaredFields();
        for(Field f :files){
            sb.append("\t");
            //获取属性的访问修饰符
            sb.append(Modifier.toString(f.getModifiers())+" ");
            //获取属性的类型
            sb.append(f.getType().getSimpleName()+" ");
            //获取属性名称
            sb.append(f.getName()+";"+"\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
