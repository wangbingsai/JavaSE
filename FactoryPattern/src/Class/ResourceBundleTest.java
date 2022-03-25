package Class;

import java.util.ResourceBundle;

/**
 * @Author 空白
 * @Date 2021/9/13 20:49
 * @Version 1.0
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle db = ResourceBundle.getBundle("db");
        String string = db.getString("name");
        System.out.println(string);
    }

}
