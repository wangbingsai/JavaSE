package Class;

/**
 * @Author 空白
 * @Date 2021/9/13 20:06
 * @Version 1.0
 */
public class PathTest {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();
        System.out.println(path);
    }
}
