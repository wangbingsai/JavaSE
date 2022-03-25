package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author 空白
 * @Date 2021/9/5 21:48
 * @Version 1.0
 */
public class IoTest {
    public static void main(String[] args) {
        FileInputStream input = null;
        byte[] bytes = new byte[4];

        try {
           input = new FileInputStream("FactoryPattern/src/io/temp.txt");
            /*int count=0;*/
          /*  int read = input.read(bytes);
            System.out.println(new String(bytes));*/
       /*  while ((count=input.read(bytes))!=-1){
             System.out.print(new String(bytes,0,count));

         }*/
            input.skip(2);
            System.out.println(input.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
