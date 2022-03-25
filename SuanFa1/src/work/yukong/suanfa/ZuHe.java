package work.yukong.suanfa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/11/23 20:19
 * @Version 1.0
 */
public class ZuHe{
    public static void main(String[] args) {
       String[] str1 = {"red","yellow"};
       String[] str2 = {"30","20","10"};
       String[] str3 = {"滑盖","翻盖"};
       for (int i = 0; i < str1.length; i++){
           for (int j = 0; j < str2.length; j++) {
               for (int k = 0; k < str3.length; k++) {
                   System.out.println(str1[i]+" "+str2[j]+" "+str3[k]);
               }
           }
       }

    }
}
