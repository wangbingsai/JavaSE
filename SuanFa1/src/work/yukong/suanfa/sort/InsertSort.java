package work.yukong.suanfa.sort;
import java.util.Arrays;
/**
 * @Author 空白
 * @Date 2022/3/28 23:54
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,-1,7};
        insertSort(arr);
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
