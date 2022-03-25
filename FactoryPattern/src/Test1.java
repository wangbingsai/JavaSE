import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TreeSet;

public class Test1 {
    @Test
    public void test() {
        long a = 2147483649L;
        int b = (int) a;
        System.out.println(b);
    }

    @Test
    public void test1() {
        int i = 0, sum = 0;
        for (i = 0; i <= 1000; i++) {
            if (i % 7 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void test2() {
        int n = 9;
        for (int i = n; i >= n; i++) {
            for (int x = 2; x < n; x++) {
                if (i % x == 0) {

                    System.out.println("--------------");
                } else {
                    System.out.println(i);
                    break;
                }

            }
            break;
        }
    }

    @Test
    public void test3() {
        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 1;
        if (a[0][0] == a[0][1]) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

    }

    @Test
    public void test4() {
        for (int i = 2; i < 2; i++) {
            System.out.println(1);
            if (2 % i == 0) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }

    @Test
    public void Te() throws ParseException {

    }
    @Test
    public void Test003(){
        TreeSet<String> ts = new TreeSet<>();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("wangliu");
        for(String str : ts){
            System.out.println(str);
        }
    }
    @Test
    public void Test004(){
        int a = 0;
        a = ++a + a++;
        System.out.println(a);
    }
    @Test
    public void Test005() {
        String str = new String("a");
        String str2 = new String("a");
        System.out.println(str == str2);
        Integer a = 1;
        Integer b = 1;
        System.out.println(a==b);

    }
    @Test
    public void Test006() {

            System.out.println("HelloWorld.java".substring(4,8));

    }
}

