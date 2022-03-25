package work.yukong.suanfa;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/10/25 21:56
 * @Version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        s=s+" ";
        s+=s2;
        printHello(s);

    }
    public static void printHello(String str){

        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            int i1 = Integer.parseInt(s[i]);
            char c = (char)i1;
            System.out.print(c);
        }

    }
}
