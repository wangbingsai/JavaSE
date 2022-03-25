package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * @Author 空白
 * @Date 2021/9/7 17:56
 * @Version 1.0
 */
public class IOandProperties {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("userinfo");
        Properties pr = new Properties();
        pr.load(reader);
        System.out.println(pr.getProperty("username"));

    }
}
