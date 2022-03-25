package work.yukong.suanfa;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/10/25 21:24
 * @Version 1.0
 */
public class Cow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        while (n>0){
            System.out.println(cowSum(n));
            System.out.println(System.currentTimeMillis() - startTime);
             n = scanner.nextInt();
        }


    }
    public static int cowSum(int n) {
        if (n <= 4) {
            return n;
        }
        return cowSum(n-1)+cowSum(n-3);
    }
}
