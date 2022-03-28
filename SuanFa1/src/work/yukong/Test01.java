package work.yukong;


import org.junit.Test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author 空白
 * @Date 2021/12/21 21:43
 * @Version 1.0
 */
public class Test01 {
    String str;
    static int b;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("请输入三个数");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for (int a = 0; a < arr.length; a++) {
                System.out.print(arr[a]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");

        double sum = 0;
        System.out.println("从大到小排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("平均数为:"+(sum/ arr.length));


    }

    @Test

    public void test01() {
        Stack<Object> objects = new Stack<>();
        System.out.println(objects.peek());
    }
}
