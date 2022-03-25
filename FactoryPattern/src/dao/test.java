package dao;

import java.util.Objects;

/**
 * @Author 空白
 * @Date 2021/8/18 22:47
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

        int[] as = new int[5];
        String[] str=new String[3];
        int[] arrs={1,2,3};
        int[][] b=new int[5][6];
        int[][] v={
                {1},{2}
        };
    }
    private int a;
    private  String b;

    public test(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof test)) return false;
        test test = (test) o;
        return a == test.a &&
                b.equals(test.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
