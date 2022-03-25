package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Author 空白
 * @Date 2021/9/6 22:17
 * @Version 1.0
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try {
            PrintStream log = new PrintStream(new FileOutputStream("log", true));

            System.setOut(log);
            System.out.println("nihao");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
