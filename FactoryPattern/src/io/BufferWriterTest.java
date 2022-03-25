package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 空白
 * @Date 2021/9/6 21:31
 * @Version 1.0
 */
public class BufferWriterTest {
    public static void main(String[] args) {
        FileWriter fw =null;
        BufferedWriter bw =null;
        try {
             fw = new FileWriter("Text.java", true);
             bw = new BufferedWriter(fw);
             bw.write("你好");
             bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
