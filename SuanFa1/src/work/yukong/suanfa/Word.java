package work.yukong.suanfa;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/10/27 20:10
 * @Version 1.0
 */
public class Word {
    public static void main(String[] args) {
        count();
    }
    public static void count(){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a'] += 1;
        }
        int maxInt = 0;
        char maxWord = '0';
        for (int i = 0; i < 26; i++) {
            if(count[i] >maxInt){
                maxInt = count[i];
                maxWord =(char) (i + 'a');
            }
        }
        System.out.println(maxInt);
        System.out.println(maxWord);
    }
}
