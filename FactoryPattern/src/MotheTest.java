public class MotheTest {
    public static void main(String[] args) {
        int x=100;
        System.out.println("main begin");
        m1(x);
        System.out.println("main over");
    }
    public static void m1(int i ){
        System.out.println("m1 begin");
        m2(i);
        System.out.println("m1 over");
    }
    public static void m2(int i){
        System.out.println("m2 begin");
        m3(i);
        System.out.println("m2 over");
    }
    public static void m3(int i){
        System.out.println("m3 begin");
        System.out.println(i);
        System.out.println("m3 over");
    }

}
