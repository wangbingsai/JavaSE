package work.yukong.suanfa.sort;

import java.util.Arrays;

/**
 * @Author 空白
 * @Date 2022/3/30 22:06
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,9,4,-5,55,3,6,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr ,int left,int right){
        int temp = 0;
        int l = left;
        int r = right;
        int pivot = arr[(left+right)/2];
        while (l < r) {
            //找出左边大于pivot的数
            while (arr[l] < pivot) {
                l += 1;
            }
            //找出右边小于pivot的数
            while (arr[r] > pivot){
                r -= 1;
            }
            //如果l>=r,就说明排序完成
            if (l >= r) {
                break;
            }
            //交换顺序
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            //防止有重复数，变成死循环
            if (arr[r] == pivot) {
                l += 1;
            }
            if (arr[l] == pivot ){
                r -= 1;
            }
        }
        //防止栈溢出，所以要对l r 控制
        if (l == r){
            l += 1;
            r -= 1;
        }
        //右递归
        if(l < right){
            quickSort(arr,l,right);
        }
        //左递归
        if(r > left){
            quickSort(arr,left,r);
        }
    }
}
