package work.yukong.suanfa.sort;

import com.sun.xml.internal.ws.policy.spi.PrefixMapper;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author 空白
 * @Date 2022/3/29 22:51
 * @Version 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {3,7,8,13,-1,5,45,36};
        shellSort(arr);
        //测试8w个数字的排序时间，50ms
     /*   int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int)(Math.random()*800000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        shellSort(arr);
        Date date1 = new Date();
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);*/
    }
    public static void shellSort(int[] arr){
        //先找出增量，一般是元素长度的一半
        for (int gap = arr.length/2; gap > 0; gap = gap/2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                //用来控制arr[j] = temp,后面的数比前面的大才进行交换
                if (arr[j] < arr[j - gap]){
                    //进行插入排序
                    while (j - gap >= 0 && temp < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
