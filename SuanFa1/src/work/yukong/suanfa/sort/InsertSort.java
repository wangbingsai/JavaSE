package work.yukong.suanfa.sort;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author 空白
 * @Date 2022/3/28 23:54
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,-1,7};
        insertSort(arr);
        /*int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int)(Math.random()*800000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        insertSort(arr);
        Date date1 = new Date();
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);*/
    }
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            //arr[i]表示待插入的数
            int insertVal = arr[i];
            //i-1表示待插入数的前一个数的索引
            int insertIndex = i-1;
            //第一个条件大于0表示防止数组越界，第二个条件是待插入的数如果比前一个数小
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                //如果待插入的数比前一个小就把前一个数后移
                arr[insertIndex + 1] = arr[insertIndex];
             //i--在这个循环中表示，让insertVal一直与前一个比较
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
