package work.yukong.suanfa;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/10/25 17:55
 * @Version 1.0
 */
public class Monkey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sn(scanner.nextInt()));
    }
    public static int sn(int n){
        int sum=0;
    for(int b = 1;b <= n; b++){

        sum+=jiecheng(b);
    }
    return sum;
    }
    public static int jiecheng(int n ){
        if (n==1)
        {
            return 1;
        }
        return n*jiecheng(--n);
    }
}
