package File01;

import java.io.File;

/**
 * @Author 空白
 * @Date 2021/9/6 23:49
 * @Version 1.0
 */
public class listFiles {
    public static void main(String[] args) {
        File f = new File("D:\\JavaSE");
        File[] files = f.listFiles();
        for (File f1 : files){
            System.out.println(f1.getAbsolutePath());
/*
            System.out.println(f1.getName());
*/
        }
    }
}
