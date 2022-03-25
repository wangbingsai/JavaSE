package File01;

import java.io.*;

/**
 * @Author 空白
 * @Date 2021/9/7 13:48
 * @Version 1.0
 */
public class CopyAll {
    public static void main(String[] args) {
        //拷贝源目录
        File srcFile = new File("D:\\JavaSE\\dome1");
        //拷贝目标目录
        File destFile = new File("D:\\FileTest");
        copyDir(srcFile,destFile);

    }
    public static void copyDir(File src,File dest){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        if (src.isFile()){
            try {
                //创建输入流
                 fis = new FileInputStream(src.getAbsoluteFile());
                String path = dest.getAbsolutePath().endsWith("\\") ? dest.getAbsolutePath() + src.getAbsolutePath().substring(3) : dest.getAbsolutePath() + "\\" + src.getAbsolutePath().substring(3);
                //创建字节数组 容量1MB
                byte[] b = new byte[1024*1024];
                //创建输出流
                 fos = new FileOutputStream(path);
                 //边读边写
                int count = 0;
                while ((count = fis.read(b))!=-1){
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
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }



            return;
        }
        File[] files = src.listFiles();
        for (File f : files) {

            File file = f.getAbsoluteFile();
            if (file.isDirectory()) {
                String str = dest.getAbsolutePath().endsWith("\\") ? dest.getAbsolutePath() + file.getAbsolutePath().substring(3) : dest.getAbsolutePath() + "\\" + file.getAbsolutePath().substring(3);
                File file1 = new File(str);
                if (!file1.exists()) {
                    file1.mkdirs();
                }


            }
            copyDir(f, dest);
        }

    }

}
