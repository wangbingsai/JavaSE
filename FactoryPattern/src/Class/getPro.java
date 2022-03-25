package Class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author 空白
 * @Date 2021/9/13 19:11
 * @Version 1.0
 */
public class getPro {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        FileReader readable = new FileReader("FactoryPattern/src/Propreties1.properties");
        Properties properties = new Properties();
        properties.load(readable);
        readable.close();
        String className = properties.getProperty("className");
        Class aClass = Class.forName(className);
        Object o = aClass.newInstance();
        System.out.println(o);


    }
}
