package Class;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author 空白
 * @Date 2021/9/13 20:38
 * @Version 1.0
 */
public class IoTest {
    public static void main(String[] args) throws IOException {
        InputStream rs = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(rs);
        rs.close();
        System.out.println(properties.getProperty("name"));
    }
}
