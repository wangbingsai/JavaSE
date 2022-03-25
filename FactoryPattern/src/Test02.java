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

        /*Test03 test03 = new Test02();
        if (test03 instanceof Test02) {
            Test02 test031 = (Test02) test03;
            test031.test02();

        }*/
//        add();
        MyexceptionTest myexceptionTest = new MyexceptionTest();
        try {
            myexceptionTest.select(21);
        } catch (Myexception myexception) {
            myexception.printStackTrace();
        }

    }
    public static void add(){
        int i = 100;
        try {
            System.out.println("try---->"+i);
            return;
        }finally {
            i++;
            System.out.println(i);
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

class Myexception extends Exception {
    public Myexception() {
    }

    public Myexception(String message) {
        super(message);
    }

}
class MyexceptionTest{
    public void select(int arg) throws Myexception {
        if (arg>20){
           throw  new Myexception("超过20请输入不大于20的数字");
        }
        System.out.println(arg);
    }
}
