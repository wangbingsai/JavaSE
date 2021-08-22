import org.junit.Test;

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
    public void Te() {
        Integer integer = new Integer(100);
//将引用数据类型转换成基本数据类型-->拆箱
        Integer a1 = 1000;
        Integer a2 = 1000;
        System.out.println(a1 == a2);
    }

}

