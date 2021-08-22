/**
 * @Author 空白
 * @Date 2021/8/12 15:50
 * @Version 1.0
 */
public class Test02 extends Test03 {


    public Test02(String a) {
        super(a);
    }

    public Test02() {
        super();
    }

    public void test02() {
        System.out.println("子类方法!");
    }

    public static void main(String[] args) {

        Test03 test03 = new Test02();
        if (test03 instanceof Test02) {
            Test02 test031 = (Test02) test03;
            test031.test02();

        }
    }
}

abstract class Test03 {
    public Test03(String a) {
    }

    public Test03() {

    }

    public void test1() {
        System.out.println("test1");
        this.test2();
    }

    public void test2() {
        System.out.println("test2");
    }
}

class Test01 {
    public void test0101() {
        System.out.println("test01的01");
    }
}
