package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 空白
 * @Date 2021/9/6 19:21
 * @Version 1.0
 */
public class CopyTxtTest {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("FactoryPattern/src/io/temp.txt");
            fw = new FileWriter("FileTest.txt",true);
            char[] c = new char[1024*512];
            int count = 0;
            while ((count = fr.read(c))!=-1){
                fw.write(c,0,count);

            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
