import org.hamcrest.core.Is;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int i = scanner.nextInt();
        //调用num方法找出比自身大最小的质数
       /* boolean b = isNum(i);*/
       /* if (b){
            System.out.println(i+"-->质数");
        }else {
            System.out.println(i+"-->非质数");
        }*/
        System.out.println(isNum(i) ? "质数" : "非质数");
    }

    //判断是否为质数
    public static boolean isNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //返回比自身大的最小质数
  /*  public static int num(int u) {
        while (true) {
            u++;

            if (isNum(u) == true) {
                return u;

            }
        }

    }*/
}

