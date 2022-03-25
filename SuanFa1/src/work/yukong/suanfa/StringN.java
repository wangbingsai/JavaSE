package work.yukong.suanfa;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/10/26 14:05
 * @Version 1.0
 */
public class StringN {
    public static void main(String[] args) {
    Print01();
    }
    public static void Print01(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] strings = new String[a+2];
        for (int c = 0;c<=a+1;c++){
            strings[c] = scanner.nextLine();
        }
        int i = 0;
        for (i = 0; i <=a;i++) {
            System.out.println(strings[i]);
        }
        String string = strings[1];


        String[] s = string.split(" ");
        for (String sd:s
             ) {
            System.out.println(sd);
        }
    }
}
