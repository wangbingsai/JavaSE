package work.yukong.suanfa;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/10/27 20:59
 * @Version 1.0
 */
public class ReDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans1 = 0, ans2 = 0;
        boolean flag = false;
        while (true) {
            num = runTime(num);

            if (!flag && judge(num)) {
                ans1 = num;
                flag = true;
            }
            if (judge(num) && judge2(num)) {
                ans2 = num;
                break;
            }
        }
        System.out.println(ans1);
        System.out.println(ans2);
        scanner.close();
    }
    public static boolean judge(int num) {
        String string = Integer.toString(num);

        StringBuffer stringBuffer = new StringBuffer(string.substring(4));
        if (string.startsWith(stringBuffer.reverse().toString())) {
            return true;
        }
        return false;
    }
    public static boolean judge2(int num) {
        String string = Integer.toString(num);
        if (string.charAt(0) == string.charAt(2) && string.charAt(1) == string.charAt(3)) {
            return true;
        }
        return false;
    }
    public static int runTime(int num) {
        int year = num/10000, month = (num/100)%100, day = num%100;
        day++;
        if(day > 31) {
            day = 1;
            month ++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return year*10000+month*100+day;
    }
}
