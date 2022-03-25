package File01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 空白
 * @Date 2021/9/6 22:53
 * @Version 1.0
 */
public class FileTest01 {
    public static void main(String[] args)throws Exception {
        File f = new File("D:\\file\\a\\b\\c\\d\\1.txt");
        long time = f.lastModified();
//传入日期构造方法返回日期
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(date);
        System.out.println(strTime);
        System.out.println(f.length());
       /* File f1 = f.getParentFile();
        String absolutePath = f1.getAbsolutePath();
*/

    }
}
