package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 空白
 * @Date 2021/9/6 18:54
 * @Version 1.0
 */
public class CopyTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\电子书\\计算机网络-自顶向下方法第七版.pdf");
            fos = new FileOutputStream("D:\\桌面\\计算机网络-自顶向下方法第七版.pdf",true);
            byte[] b = new byte[1024*1024];
            int count =0;
            fis.read(b);

            while ((count =fis.read(b))!=-1){
                fos.write(b,0,count);

            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ;
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
